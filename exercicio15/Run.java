package exercicio15;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		float valor = scanner.nextFloat();
		
		System.out.println(Exercicio15.verificarTipo(valor));

	}

}
