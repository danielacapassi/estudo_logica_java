package exercicio20;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {

		/*
		 * Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los
		 * em ordem crescente.
		 */

		int primeiroValor;
		int segundoValor;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		primeiroValor = scanner.nextInt();

		System.out.println("Digite o segundo valor: ");
		segundoValor = scanner.nextInt();

		if (primeiroValor > segundoValor) {
			System.out.println(primeiroValor + "," + segundoValor);
		} else {
			System.out.println(segundoValor + "," + primeiroValor);
		}
	}

}
