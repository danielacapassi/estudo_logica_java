package exercicio26;

public class Exercicio26 {
	
	public static int statusConta (int quantidadeAtual, int quantidadeMaxima, int quantidadeMinima) {
	
	/*
	 * Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em
	 * estoque e quantidade m�nima em estoque de um produto. Calcular e escrever a
	 * quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade
	 * m�nima)/2). Se a quantidade em estoque for maior ou igual a quantidade m�dia
	 * escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
	 * compra'.
	 */
	
	int quantidadeMedia = (( quantidadeMaxima + quantidadeMinima)/2);
	if (quantidadeAtual >= quantidadeMedia) {
		System.out.println("N�o efetuar a compra");
	}else {
		System.out.println("Efetuar a compra");
	}
	return quantidadeMedia;
	
	
}
}
