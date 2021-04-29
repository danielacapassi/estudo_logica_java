package exercicio10;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salarioAtual;
		float percentual;
		float salarioNovo;

		salarioAtual = 1500;
		percentual = 10;
		salarioNovo = (salarioAtual * percentual) / 100 + salarioAtual;

		System.out.println(" O salário com reajuste é de: " + salarioNovo);
	}

}
