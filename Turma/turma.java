class turma{
	Aluno[] alunos;

	double calculaMedia(){
		double soma = 0;

		for(int i = 0; i < this.notas.length; i++){
			soma += this.aluno[i].nota;
		}

		return soma / this.alunos.length;
	}
}
