package exerciciosFibonacci;

public class SequenciaDeFibonacci {

	public static void main(String[] args) {
		int tamanhoDaSequencia = 10;
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 3; i < tamanhoDaSequencia; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		

	}

}
