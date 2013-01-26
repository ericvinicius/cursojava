class funcionario{
	String nome;
	double salario;
	double aumento;

	double recebeAumento(double aumento){
		salario += aumento;
		return salario;
	}

	double calculoGanhoAnual(double salario){
		return (12 * salario); 
	}

	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
	}
}
