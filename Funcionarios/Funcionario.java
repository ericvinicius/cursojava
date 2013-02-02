class Funcionario{
	String nome;
	double salario;
	double aumento;
	int idade;
	
	Data dataEntrada = new Data();
	Conta contaFuncionario = new Conta();

	double recebeAumento(double aumento){
		salario += aumento;
		return salario;
	}

	void mostra(){
		this.dataEntrada.mostra();
		System.out.println("\tNome: " + this.nome);
		System.out.println("\tIdade: " + this.idade + " anos");
		System.out.println("\tSalario: R$" + this.salario);
		System.out.println("\tSaldo: R$" + this.Conta.mostra());
	}
}
