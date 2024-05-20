package exerciciosNExT;

import java.util.Scanner;

public class Fatorial {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular seu fatorial: ");
		long numero = scan.nextLong();
		
		long fatorial = 1;
		
		for(long i = 1; i <= numero; i++) {
			
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
		
	}
}
