package Exercicio16;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00
		 * se forem compradas pelo menos 12. Escreva um programa que leia o número de
		 * maçãs compradas, calcule e escreva o custo total da compra.
		 */

		float primeiroCustoMaca = 1.30f;
		float segundoCustoMaca = 1.00f;
		float quantidadeMaca;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantidade de maças compradas: ");
		quantidadeMaca = scanner.nextFloat();

		if (quantidadeMaca < 12) {
			quantidadeMaca = (quantidadeMaca * primeiroCustoMaca);
			System.out.println("O custo é de: " + quantidadeMaca);
		} else {
			quantidadeMaca = (quantidadeMaca * segundoCustoMaca);
			System.out.println("O custo é de: " + quantidadeMaca);
		}

	}

}
