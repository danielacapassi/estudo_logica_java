package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*
		 * Ler um valor e escrever se � positivo ou negativo (considere o valor zero
		 * como positivo).
		 */

		float valor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor: ");

		valor = scanner.nextFloat();

		if (valor < 0) {
			System.out.println("Esse n�mero � negativo");
		} else {
			System.out.println("Esse n�mero � positivo");
		}

	}

}
