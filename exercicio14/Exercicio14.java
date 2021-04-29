package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior
		 * que 10, caso contrário escrever NÃO É MAIOR QUE 10!
		 */

		float valor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor: ");

		valor = scanner.nextFloat();

		if (valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}

	}

}
