package br.com.empresa.interfaces.poligonos;
public class Retangulo implements AreaCalculavel {
	public int largura;
	public int altura;
	
	public Retangulo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calculaArea(){
		return ((this.largura) * (this.altura));
	}
}
