class Empresa{
	int qtd = 0;
	
	funcionario[] empregados;

	void adiciona(funcionario f){
		this.empregados[this.qtd] = f;
		this.qtd++;
	}
}
