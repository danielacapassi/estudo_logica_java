package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poder� ou n�o votar este ano (n�o � necess�rio considerar o
		 * m�s em que a pessoa nasceu).
		 */

		int anoAtual;
		int anoNascimento;
		int idadeEmAnos;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual � o ano atual ? ");
		anoAtual = scanner.nextInt();

		System.out.println("Qual � o ano do seu nascimento ? ");
		anoNascimento = scanner.nextInt();

		idadeEmAnos = anoAtual - anoNascimento;

		if (idadeEmAnos >= 18) {
			System.out.println("Voc� pode votar este ano!");
		} else {
			System.out.println("Voc� tem " + idadeEmAnos + " anos , n�o pode votar este ano!");
		}

	}
}