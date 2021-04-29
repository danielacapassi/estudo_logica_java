package exercicio13;

import java.util.Scanner;

public class Exercicio13 {
	
	/*
	 * Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média
	 * final deste aluno. Considerar que a média é ponderada e que o peso das notas
	 * é 2, 3 e 5
	 */

	public static void main(String[] args) {
		
		float primeiraNota;
		float segundaNota;
		float terceiraNota;
        float mediaFinal;
        
        Scanner scanner = new Scanner(System.in);
        
    	System.out.println("Escreva a primeira nota: ");
		primeiraNota = scanner.nextInt();
		
		System.out.println("Escreva a segunda nota: ");
		segundaNota = scanner.nextInt();
		
		System.out.println("Escreva a terceira nota: ");
		terceiraNota = scanner.nextInt();
        
		mediaFinal = ( primeiraNota * 2 + segundaNota * 3 + terceiraNota * 5 ) / 10 ;
		System.out.println("A média final é de:" + mediaFinal);
				
	}

}


