public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	static void metodo1() {
		System.out.println("Inicio do Metodo 1");
		try{
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do Metodo 1");
	}

	static void metodo2() {
		System.out.println("Inicio do Metodo 2");

		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);

		}

		System.out.println("Fim do Metodo 2");
	}
}
