package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vipper.modelo.Film;

public class AccesoSakila extends Conexion {
	
	public boolean altaFilm(Film peli) throws SQLException, ClassNotFoundException {
		CallableStatement st;
		String sql = "call sakila.altaFilm(?,?,?,?,?);";

		// abrir conexion
		abrirConexion();

		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);
		
		st.setInt(1, peli.getFilm_id());
		st.setString(2, peli.getTitle());
		st.setInt(3, peli.getLanguage_id());
		st.setInt(4, peli.getRental_duration());
		st.setDouble(5, peli.getRental_rate());

		// Ejecutar el Statement
		int registros = st.executeUpdate();

		cerrarConexion();

		return registros >= 1;
	}

	public String obtenerPassword(String usuario) throws ClassNotFoundException, SQLException {
		// Declaracion de variables
		CallableStatement st;
		String sql = "call sakila.verificarusuario(?);";
		ResultSet rs = null;
		String password = null;
		// abrir conexion
		abrirConexion();
		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);
		st.setString(1, usuario);
		// Ejecutar el Statement
		rs = st.executeQuery();
		if (rs.next()) {
			password = rs.getString("password");
		}
		cerrarConexion();
		return password;
	}

	public boolean actualizaContador(int nuevoContador) throws ClassNotFoundException, SQLException {

		CallableStatement st;
		String sql = "call sakila.actualiza_contador(?);";

		// abrir conexion
		abrirConexion();

		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);
		st.setInt(1, nuevoContador);

		// Ejecutar el Statement
		int registros = st.executeUpdate();

		cerrarConexion();

		return registros >= 1;
	}

	public int ObtenerContador() throws ClassNotFoundException, SQLException {
		// Declarar variables
		int contador = 0;
		CallableStatement st;
		ResultSet rs = null;
		String sql = "call sakila.consultarContador();";

		// abrir conexion
		abrirConexion();

		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);

		// Ejecutar el Statement
		rs = st.executeQuery();

		// Recorrer el ResultSet
		if (rs.next()) {
			// Instanciar el film con el constructor completo
			contador = rs.getInt("contador_visitantes");
		}

		// Cerrar la conexion
		cerrarConexion();
		return contador;

	}

	public Film ObtenerUno(int film_id) throws SQLException, ClassNotFoundException {
		// Declarar variables
		Film f1 = null;
		CallableStatement st;
		ResultSet rs = null;
		String sql = "call sakila.consultarUno(?);";

		// abrir conexion
		abrirConexion();

		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);
		st.setInt(1, film_id);

		// Ejecutar el Statement
		rs = st.executeQuery();

		// Recorrer el ResultSet
		if (rs.next()) {
			// Instanciar el film con el constructor completo
			f1 = new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"),
					rs.getInt("release_year"), rs.getInt("language_id"), rs.getInt("original_language_id"),
					rs.getInt("rental_duration"), rs.getDouble("rental_rate"), rs.getInt("length"),
					rs.getDouble("replacement_cost"), rs.getString("rating"), rs.getDate("last_update").toLocalDate());

		}

		// Cerrar la conexion
		cerrarConexion();
		return f1;
	}

	public ArrayList<Film> obtenerTodas() throws ClassNotFoundException, SQLException {
//		Stream.Builder<Film> peliculas = Stream.builder();
		// Definición de variables
		ArrayList<Film> peliculas = new ArrayList<Film>();
		CallableStatement st;
		ResultSet rs = null;
		String sql = "call sakila.consultarFilm();";

		// abrir conexion
		abrirConexion();

		// obtener el Statement de la conexion
		st = miConexion.prepareCall(sql);

		// Ejecutar el Statement
		rs = st.executeQuery();

		// Recorrer el ResultSet
		while (rs.next()) {
			// Instanciar el film con el constructor completo
			Film f1 = new Film(rs.getInt("film_id"), rs.getString("title"), rs.getString("description"),
					rs.getInt("release_year"), rs.getInt("language_id"), rs.getInt("original_language_id"),
					rs.getInt("rental_duration"), rs.getDouble("rental_rate"), rs.getInt("length"),
					rs.getDouble("replacement_cost"), rs.getString("rating"), rs.getDate("last_update").toLocalDate());

			peliculas.add(f1);
		}

		// Cerrar la conexion
		cerrarConexion();

		return peliculas;
	}

	public Stream<Film> filtrarComienzanC(Stream<Film> entrada) {
//	        Predicate<Film> p1 = f1 -> f1.getTitle().startsWith("C");
		return entrada.filter(f1 -> f1.getTitle().startsWith("C"));
	}

	public Stream<Film> filtrar_Rental_duration_entre_3_6(Stream<Film> entrada) {
		Predicate<Film> p1 = f1 -> f1.getRental_duration() >= 3 && f1.getRental_duration() <= 6;
		return entrada.filter(p1);
	}

	public Stream<Film> filtrar_Distintos_rating(Stream<Film> entrada) {
		return entrada.distinct();
	}

	public Stream<Film> filtrar_rating_PG(Stream<Film> entrada) {
		return entrada.filter(f1 -> f1.getRating().equals("PG"));
	}
	
	public List<Film> filtrar_rating(ArrayList<Film> entrada, String rating) {
		Stream<Film> filtrado = entrada.stream().filter(f1 -> f1.getRating().equals(rating));
		return filtrado.collect(Collectors.toList());
	}

	public Optional<Film> filtrar_Minimo_Longitud(Stream<Film> entrada) {
		return entrada.min((f1, f2) -> f1.getLength() - f2.getLength());
	}

	public Optional<Film> filtrar_Maximo_Rental_duratin(Stream<Film> entrada) {
		return entrada.max((f1, f2) -> f1.getRental_duration() - f2.getRental_duration());
	}

	public Stream<Double> Convertir_replacement_cost_Euro(Stream<Film> entrada) {
		return entrada.map(f1 -> f1.getReplacement_cost() * 0.91);
	}

	public Stream<Long> Convertir_Obtener_días(Stream<Film> entrada) {
		return entrada.map(f1 -> f1.getLast_update().until(LocalDate.now(), ChronoUnit.DAYS));
	}

}
