package exercicio28;

import java.util.Scanner;

public class Exercicio28 {
     //Ler 3 valores (considere que não serão informados valores iguais) 
     //	e escrever o maior deles.
	
	public static void main(String[] args) {
	

		int valorA;
		int valorB;
		int valorC;
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor: ");

		valorA = scanner.nextInt();
		
		System.out.println("Digite um valor: ");

		valorB = scanner.nextInt();
		
		System.out.println("Digite um valor: ");

		valorC = scanner.nextInt();
		

		if (valorA > valorB & valorA > valorC  ) {
			System.out.println("A");
		} else if (valorB > valorA & valorB > valorC){
			System.out.println("B");
		} else if (valorC > valorA & valorC > valorB){
			System.out.println("C");
		}
        //return valor;
	}

}
