package br.com.alexefelipe.controler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.alexefelipe.bean.Calculadora;

@ManagedBean(name = "CalculadoraMB")
@RequestScoped
public class CalculadoraMB {
	
	private Calculadora bean;
	
	public CalculadoraMB(){
		this.bean = new Calculadora();
	}

	public Calculadora getBean() {
		return bean;
	}

	public void setBean(Calculadora bean) {
		this.bean = bean;
	}
	
	public String resultado() {
        return "resultado";
    } 
	public String calc() {
		this.bean = new Calculadora();
        return "index";
    } 
	
	public double calcular() {

		double result = 0.0;

		if (bean.getOperador() == '+') {
			result = bean.getN1() + bean.getN2();
		} else if (bean.getOperador() == '-') {
			result = bean.getN1() - bean.getN2();
		} else if (bean.getOperador() == '/') {
			result = bean.getN1() / bean.getN2();
		} else if (bean.getOperador() == '*') {
			result = bean.getN1() * bean.getN2();
		} else if (bean.getOperador() == '^') {
			result = Math.pow(bean.getN1(), bean.getN2());
		}  

		return result;

	}

}
