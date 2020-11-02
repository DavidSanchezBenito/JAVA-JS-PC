package com.vipper.modelo;

import java.io.Serializable;

public class numeros implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double numero1;
	private Double numero2;
	private String OPE;
	
	public numeros() {
		// TODO Auto-generated constructor stub
	}

	
//	public numeros(Double numero1, Double numero2, String oPE) {
//		super();
//		this.numero1 = numero1;
//		this.numero2 = numero2;
//		this.OPE = oPE;
//	}


	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public String getOPE() {
		return OPE;
	}

	public void setOPE(String oPE) {
		OPE = oPE;
	}
	
	public double realizarOperacion() {
		double resultado=0;
		
	if (OPE.equals("S")) {
		resultado= numero1+numero2;
	}else if (OPE.equals("M")) {
		resultado= numero1*numero2;
	}else if (OPE.equals("R")) {
		resultado= numero1-numero2;
	}else if (OPE.equals("D")) {
			resultado= numero1/numero2;
		
	}return resultado;
	
}
}
