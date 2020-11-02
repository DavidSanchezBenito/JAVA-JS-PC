package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;



public class AccesoBiblioteca extends Conexion {
	
	public String verifica(String email) throws SQLException, ClassNotFoundException {

		//sentencia SQL a ejecutar:
	    String sql = "call biblioteca.verifica(?,?);"; //ojo es un proc alm con param de salida, son dos argumentos
	    //utilizo el CallableStatement
	    CallableStatement st;
	    //ResultSet rs;   //es donde almacenamos los datos consultados, pero no se utiliza al tener param de salida
	    //el resultadoset 
	    
	    abrirConexion();
	  //obtener el comando de conexion
	    st= miConexion.prepareCall(sql);  
	    st.setString(1, email);  //le paso a la sentencia sql el param 1 introducido en el metodo
	    st.registerOutParameter(2, Types.VARCHAR);   //especifico q es un parm de salida, el varchar q lo saque Eclipse
	 
	    //ejecutar el statement
	    st.execute();
	    String password=null;  
	    password=st.getString(2);  //el parametro q me devuelve lo almaceno
	    if(password==null) {   //convierto el nulo a blancos
	    	password="";
	    }
	    
	 //rs=st.executeQuery();  //ejecuto query
	    
//	    if (rs.next()) {  //si existe el usuario, almaceno la password y la envio al servlet con el return
//		       password= rs.getString("password"); //igual q la columna de la tabla en Mysql creada   
//		    }
	    cerrarConexion();
		return password;

	}
	 
    } 
  

