package br.com.empresa.sistema;
import br.com.empresa.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo Anterior:" + c.getSaldo());
		c.atualiza(this.selic);
		saldoTotal += c.getSaldo();
		System.out.println("Novo Saldo: " + saldoTotal);
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}
