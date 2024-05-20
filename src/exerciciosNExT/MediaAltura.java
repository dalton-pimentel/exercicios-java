package exerciciosNExT;

import java.util.Scanner;

public class MediaAltura {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int quantidadeDePessoas = scan.nextInt();
		
		String[] sexo = new String[quantidadeDePessoas];
		double[] altura = new double[quantidadeDePessoas];
		
		for(int i = 0; i < quantidadeDePessoas; i++) {
			System.out.println("Informe o sexo da pessoa nº " + (i+1) + ": ");
			sexo[i] = scan.next();
			
			System.out.println("Informe a altura da pessoa nº " + (i+1) + ": ");
			altura[i] = scan.nextDouble();			
		}
		
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		
		for(int i = 0; i < altura.length; i++) {
			
			if(i == 0) {
				menorAltura = altura[i];
				maiorAltura = altura[i];
			}
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			
		}
		
		double somaAlturasHomens = 0;
		int contagemHomens = 0;
		int contagemMulheres = 0;
		for (int i = 0; i < sexo.length; i++) {
			if(sexo[i].equalsIgnoreCase("masculino")) {
				somaAlturasHomens += altura[i];
				contagemHomens++;
			}else if (sexo[i].equalsIgnoreCase("feminino")) {
				contagemMulheres++;
			}
		}
			
		double mediaAlturaHomens = (contagemHomens > 0) ? somaAlturasHomens / contagemHomens : 0;
		
		
		System.out.println("A menor altura é : " + menorAltura);
		System.out.println("A maior altura é : " + maiorAltura);
		System.out.println("A média de altura dos homens é: " + mediaAlturaHomens);
		System.out.println("O número de mulheres é: " + contagemMulheres);
	}
}
