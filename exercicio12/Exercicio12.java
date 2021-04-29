package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
	 * escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
	 * C F - 32 ---------- = ----------- 5 9 Observação: Para testar se a sua
	 * resposta está correta saiba que 100oC = 212F
	 */

	public static void main(String[] args) {

		float temperaturaFahrenheit;
		float temperaturaCelsius;

		// Objeto para leitura de valores
		Scanner scanner = new Scanner(System.in);

		// Inicialização das variáveis
		System.out.println("Escreva a temperatura em Fahrenheit: ");
		temperaturaFahrenheit = scanner.nextInt();

		temperaturaCelsius = (temperaturaFahrenheit - 32) / 9 * 5;
		System.out.println("Temperatura em Celsius é ");
		System.out.println(temperaturaCelsius);

	}

}
