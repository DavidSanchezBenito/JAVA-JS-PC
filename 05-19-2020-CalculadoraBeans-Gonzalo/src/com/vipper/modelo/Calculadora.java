package com.vipper.modelo;

import java.io.Serializable;

public class Calculadora implements Serializable {
	private double num1, num2;
	private String operacion;

	public double realizarOperacion() {	
		double resultado = 0;
		if(operacion.equals("+")) {
			resultado=num1+num2;
		} else if(operacion.equals("-")) {
			resultado=num1-num2;
		} else if(operacion.equals("*")) {
			resultado=num1*num2;
		} else if(operacion.equals("/")) {
			resultado=(double)num1/num2;
		}
		return resultado;
	}
	
	public Calculadora() {}

	public Calculadora(double num1, double num2, String operacion) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operacion = operacion;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}


	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}


	
	
}
