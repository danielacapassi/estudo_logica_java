package exercicio17;

public class Exercicio17 {

	public static void main(String[] args) {
	
		/*
		 * Insira as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica
		 * simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
		 * (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever
		 * tamb�m a m�dia calculada.
		 */ 
		
		float primeiraAvaliacao = 5.5f;
		float segundaAvaliacao=10f;
		float media = (primeiraAvaliacao * segundaAvaliacao) / 2;
		
		if(media >= 6) {
			System.out.println("M�dia: " + media + " Aluno Aprovado!");
		}else {
			System.out.println("M�dia: " + media + " Aluno Reprovado!");
		}
		
	}

}
