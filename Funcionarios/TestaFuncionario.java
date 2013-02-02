class TestaFuncionario{
	public static void main(String[] args){
		int i = 1;

		Empresa losNerds = new Empresa();
		losNerds.empregados = new funcionario[10];

		funcionario f1 = new funcionario();
		Conta contaf1 = new Conta();
		
		Data data = new Data();

		System.out.println("---------------------------------------------------");
		System.out.println("Funcionario " + i + ":");
		i++;

		f1.nome = "Eric";		
		f1.idade = 17;
		f1.salario = 1000;		
		f1.aumento = 250.75;
		f1.recebeAumento(f1.aumento);
		losNerds.adiciona(f1);
		f1.mostra();

		System.out.println("---------------------------------------------------");
		System.out.println("Funcionario " + i + ":");
		i++;

		funcionario f2 = new funcionario();
	
		f2.nome = "Thais";
		f2.idade = 18;
		f2.salario = 1000;
		f2.aumento = 570.10;
		f2.recebeAumento(f2.aumento);
		losNerds.adiciona(f2);
		f2.dataEntrada = data;
		f2.mostra();

		System.out.println("---------------------------------------------------");	
	}
}
