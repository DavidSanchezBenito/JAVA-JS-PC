package com.vipper.modelo;

import java.io.Serializable;

public class usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id_usuario;  //no se va a usar pero se puede utilizar luego para enviar a la capa pers
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	
	//para la capa de presentacion nos seguira usando los constructores q nos hagan falta
	
	public usuario() { 
		//para el bean solo necesita este vacio
	}

	
	public usuario(String email,String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
