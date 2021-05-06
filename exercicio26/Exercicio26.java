package exercicio26;

public class Exercicio26 {
	
	public static int statusConta (int quantidadeAtual, int quantidadeMaxima, int quantidadeMinima) {
	
	/*
	 * Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
	 * estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
	 * quantidade média ((quantidade média = quantidade máxima + quantidade
	 * mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média
	 * escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
	 * compra'.
	 */
	
	int quantidadeMedia = (( quantidadeMaxima + quantidadeMinima)/2);
	if (quantidadeAtual >= quantidadeMedia) {
		System.out.println("Não efetuar a compra");
	}else {
		System.out.println("Efetuar a compra");
	}
	return quantidadeMedia;
	
	
}
}
