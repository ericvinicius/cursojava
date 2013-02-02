class Conta{
	private double saldo = 100;


	public void depositar(double deposito){
		this.saldo += deposito;
	}

	public void saca(double valor){
		if(this.saldo >= valor){	
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public double mostra(){
		return this.saldo;
	}



}
