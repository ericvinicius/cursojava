package br.com.empresa.funcionarios;
import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaPoupanca;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();

		try {
			cp.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
