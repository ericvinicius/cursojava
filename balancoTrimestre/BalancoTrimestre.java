class BalancoTrimestre{
	public static void main(String [] args){
		int janeiro, fevereiro, marco;
		janeiro = 15000;
		fevereiro = 23000;
		marco = 17000;
	
		System.out.println("O gasto do trimestre foi: " + (janeiro + fevereiro + marco));
		System.out.println("O gasto medio mensal foi de: " + ((janeiro + fevereiro + marco) / 3));
	}
}
