class Exe313f{
	public static void main(String[] args){	
		int n1, n2, res;

		n1 = 0;
		n2 = 1;

		System.out.println(n1 + "\n" + n2);

		for(res = 0; res <= 100; ){
			res = n1 + n2;
			n1 = n2;
			n2 = res;

			System.out.println(res);
		}	
	}
}
