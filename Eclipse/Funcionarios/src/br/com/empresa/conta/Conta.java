package br.com.empresa.conta;
/**
 * 
 * Classe responsavel por moldar as contas do banco.
 * 
 * @author oo3305
 * @version 1.0
 *
 *	
 *
 */
abstract public class Conta {
	protected int numero;
	private double saldo;
	
	public boolean equals(Object obj){
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero;
	}
	
	public String toString(){
		return "Esse Objeto é uma conta com saldo R$" + this.saldo;
	}

	/**
	 * 
	 * @param valor
	 * 
	 * 
	 */
	public void deposita(double valor) {
		if(valor < 0){
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		} else{
			this.saldo += valor - 0.10;
		}
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public double getSaldo() {
		return saldo;
	}

}