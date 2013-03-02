class Empresa{
	int qtd = 0;
	
	Funcionario[] empregados;

	void adiciona(Funcionario f){
		this.empregados[this.qtd] = f;
		this.qtd++;
	}
}
