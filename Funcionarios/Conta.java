class Conta{
	protected double saldo;

	public void deposita(double deposito){
		this.saldo += deposito;
	}

	public void saca(double valor){	
		this.saldo -= valor;
	}

	void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	public double getSaldo(){
		return this.saldo;
	}



}
