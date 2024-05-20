package exerciciosNExT;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
			
			int x, y, z;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o valor de x: ");
			x = scan.nextInt();
			System.out.println("Informe o valor de y: ");
			y = scan.nextInt();
			System.out.println("Informe o valor de z: ");
			z = scan.nextInt();
			
			int primeiro, segundo, terceiro;
			
	        if (x < y && x < z) {
	            primeiro = x;
	            if (y < z) {
	                segundo = y;
	                terceiro = z;
	            } else {
	                segundo = z;
	                terceiro = y;
	            }
	        } 
	        
	        else if (y < x && y < z) {
	            primeiro = y;
	            if (x < z) {
	                segundo = x;
	                terceiro = z;
	            } else {
	                segundo = z;
	                terceiro = x;
	            }
	        } 
	        
	        else {
	            primeiro = z;
	            if (x < y) {
	                segundo = x;
	                terceiro = y;
	            } else {
	                segundo = y;
	                terceiro = x;
	            }
	        }

	        
	        System.out.println("Números em ordem crescente: ");
	        System.out.println(primeiro);
	        System.out.println(segundo);
	        System.out.println(terceiro);
	}

}
