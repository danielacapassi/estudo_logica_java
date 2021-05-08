package exercicio27;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
	

		//Ler um valor e escrever se é positivo, negativo ou zero.

		int valor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor: ");

		valor = scanner.nextInt();

		if (valor > 0) {
			System.out.println("POSITIVO");
		} else if (valor < 0){
			System.out.println("NEGATIVO");
		} else {
			System.out.println("ZERO");
		}
       
	}

}

