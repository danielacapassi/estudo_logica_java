package exercicio19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		
		/*
		 * Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o
		 * maior deles.
		 */
		
		
		float primeiroValor;
		float segundoValor;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		primeiroValor = scanner.nextFloat();
        
		System.out.println("Digite o segundo valor: ");
		segundoValor = scanner.nextFloat();
		
		if (primeiroValor > segundoValor) {
			System.out.println(primeiroValor + " � o maior valor"); 
		}else {
			System.out.println(segundoValor + " � o maior valor");
		}
		
	}

}
