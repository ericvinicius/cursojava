class TestaFuncionario{
	public static void main(String[] args){
		int i = 1;

		Empresa losNerds = new Empresa();
		losNerds.empregados = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		Conta cf1 = new Conta();
		ContaCorrente ccf1 = new ContaCorrente();
		ContaPoupanca cpf1 = new ContaPoupanca();
		
		Data data = new Data();

		System.out.println("---------------------------------------------------");
		System.out.println("Funcionario " + i + ":");
		i++;

		f1.nome = "Eric";		
		f1.idade = 17;
		f1.setSalario(1000);		
		f1.aumento = 250.75;
		f1.getAumento(f1.aumento);
		losNerds.adiciona(f1);		

		cf1.deposita(1000);
		ccf1.deposita(1000);
		cpf1.deposita(1000);

		cf1.atualiza(0.01);
		ccf1.atualiza(0.01);
		cpf1.atualiza(0.01);	

		f1.mostra();

		System.out.println("---------------------------------------------------");
		System.out.println("Funcionario " + i + ":");
		i++;

		Funcionario f2 = new Funcionario();
	
		f2.nome = "Vinicius";
		f2.idade = 17;
		f2.setSalario(1000);
		f2.aumento = 570.10;
		f2.getAumento(f2.aumento);
		losNerds.adiciona(f2);
		f2.dataEntrada = data;
		f2.mostra();

		System.out.println("---------------------------------------------------");	
	}
}
