package br.com.alexefelipe.bean;

public class Calculadora {

	private double n1;
	private double n2;
	private char operador;

	public Calculadora() {
		super();		
	}

	public Calculadora(double n1, double n2, char operador) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.operador = operador;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

}
