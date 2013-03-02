class Funcionario{
	String nome;
	public double salario;
	double aumento;
	int idade;
	
	
	Data dataEntrada = new Data();
	Conta cF = new Conta();
	ContaCorrente ccF = new ContaCorrente();
	ContaPoupanca cpF = new ContaPoupanca();

	public double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	double getAumento(double aumento){
		salario += aumento;
		return salario;
	}

	void mostra(){
		this.dataEntrada.mostra();
		System.out.println("\tNome: " + this.nome);
		System.out.println("\tIdade: " + this.idade + " anos");
		System.out.println("\tSalario: R$" + this.salario);
		System.out.println("\tSaldo Conta: R$" + cF.getSaldo());
		System.out.println("\tSaldo Conta Corrente: R$" + ccF.getSaldo());
		System.out.println("\tSaldo Conta Poupanca: R$" + cpF.getSaldo());


	}
}
