
public class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		super.deposita(valor);
	}

	public void atualiza(double taxa) {
		super.atualiza(2*taxa);
	}

}

