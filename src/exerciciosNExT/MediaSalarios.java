package exerciciosNExT;

import java.util.Scanner;

public class MediaSalarios {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos funcionarios existem na empresa? ");
		int numeroDeFuncionarios = scan.nextInt();
		
		String[] nomes = new String[numeroDeFuncionarios];
		double[] salarios = new double[numeroDeFuncionarios];
		
		for(int i = 0;i < numeroDeFuncionarios; i++) {
			System.out.println("Digite o nome do funcionário " + (i + 1) + ": ");
			nomes[i] = scan.next();
			
			System.out.println("Digite o salário do funcionário " + nomes[i] + ": ");
			salarios[i] = scan.nextDouble();
		}
		
		double somaSalarios = 0;
		for (int i = 0; i < numeroDeFuncionarios; i++) {
			somaSalarios += salarios[i];
		}
		
		double mediaSalarial = somaSalarios / numeroDeFuncionarios;
		
		System.out.println("A média salarial da empresa é: "  + mediaSalarial);
		
		scan.close();
	}
}
