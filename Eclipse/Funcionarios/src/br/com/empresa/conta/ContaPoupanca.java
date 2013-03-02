package br.com.empresa.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void deposita(double valor) {
		super.deposita(valor);
	}

	public void atualiza(double taxa) {
		super.atualiza(2 * taxa);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.getNumero() < o.getNumero()){
			return -1;
		} else if(this.getNumero() > o.getNumero()){
			return 1;
		}
		return 0;
	}

}
