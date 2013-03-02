
public class ContaCorrente extends Conta {

	public void deposita(double valor) {
		super.deposita(valor-0.10);
	}

	public void atualiza(double taxa) {
		super.atualiza(2*taxa);
	}

}
