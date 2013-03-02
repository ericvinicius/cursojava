package br.com.empresa.interfaces.poligonos;
public class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		return ((this.lado)*(this.lado));
	}
}
