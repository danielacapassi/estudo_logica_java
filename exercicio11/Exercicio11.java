package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Uma revendedora de carros usados paga a seus funcionários vendedores um
		 * salário fixo por mês, mais uma comissão também fixa para cada carro vendido e
		 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
		 * o número de carros por ele vendidos, o valor total de suas vendas, o salário
		 * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
		 * final do vendedor
		 */

		// Declaração das variáveis
		int numeroCarros;
		float valorVendas;
		float salario;
		float valorPorCarro;
		float salarioFinal;
		float comissaoFixa;

		// Objeto para leitura de valores
		Scanner myObj = new Scanner(System.in);

		// Inicialização das variáveis
		System.out.println("Escreva a quantidade de carros vendidos: ");
		numeroCarros = myObj.nextInt();

		System.out.println("Escreva o valor das vendas: ");
		valorVendas = myObj.nextFloat();

		System.out.println("Escreva o valor do salário: ");
		salario = myObj.nextFloat();

		System.out.println("Escreva o valor de comissão por carro: ");
		valorPorCarro = myObj.nextFloat();

		comissaoFixa = 0.05f;

		// Cálculo
		salarioFinal = salario + (numeroCarros * valorPorCarro) + valorVendas * comissaoFixa;
		System.out.println(salarioFinal);

	}
}
