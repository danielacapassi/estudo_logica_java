package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Uma revendedora de carros usados paga a seus funcion�rios vendedores um
		 * sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e
		 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
		 * o n�mero de carros por ele vendidos, o valor total de suas vendas, o sal�rio
		 * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio
		 * final do vendedor
		 */

		// Declara��o das vari�veis
		int numeroCarros;
		float valorVendas;
		float salario;
		float valorPorCarro;
		float salarioFinal;
		float comissaoFixa;

		// Objeto para leitura de valores
		Scanner myObj = new Scanner(System.in);

		// Inicializa��o das vari�veis
		System.out.println("Escreva a quantidade de carros vendidos: ");
		numeroCarros = myObj.nextInt();

		System.out.println("Escreva o valor das vendas: ");
		valorVendas = myObj.nextFloat();

		System.out.println("Escreva o valor do sal�rio: ");
		salario = myObj.nextFloat();

		System.out.println("Escreva o valor de comiss�o por carro: ");
		valorPorCarro = myObj.nextFloat();

		comissaoFixa = 0.05f;

		// C�lculo
		salarioFinal = salario + (numeroCarros * valorPorCarro) + valorVendas * comissaoFixa;
		System.out.println(salarioFinal);

	}
}
