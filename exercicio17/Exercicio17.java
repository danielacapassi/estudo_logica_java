package exercicio17;

public class Exercicio17 {

	public static void main(String[] args) {
	
		/*
		 * Insira as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
		 * simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
		 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
		 * também a média calculada.
		 */ 
		
		float primeiraAvaliacao = 5.5f;
		float segundaAvaliacao=10f;
		float media = (primeiraAvaliacao * segundaAvaliacao) / 2;
		
		if(media >= 6) {
			System.out.println("Média: " + media + " Aluno Aprovado!");
		}else {
			System.out.println("Média: " + media + " Aluno Reprovado!");
		}
		
	}

}
