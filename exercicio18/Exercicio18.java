package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
		 * mês em que a pessoa nasceu).
		 */

		int anoAtual;
		int anoNascimento;
		int idadeEmAnos;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual é o ano atual ? ");
		anoAtual = scanner.nextInt();

		System.out.println("Qual é o ano do seu nascimento ? ");
		anoNascimento = scanner.nextInt();

		idadeEmAnos = anoAtual - anoNascimento;

		if (idadeEmAnos >= 18) {
			System.out.println("Você pode votar este ano!");
		} else {
			System.out.println("Você tem " + idadeEmAnos + " anos , não pode votar este ano!");
		}

	}
}