package exercicio25;

public class Exercicio25 {
	
	public static int calcularSaldo ( int saldo, int debito, int credito) {
	/*
	 * Fa�a um algoritmo para ler:  saldo, d�bito e
	 * cr�dito. Ap�s, calcular e escrever o saldo atual (saldo atual = saldo -
	 * d�bito + cr�dito). Tamb�m testar se saldo atual for maior ou igual a zero
	 * escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo
	 * Negativo'.
	 */
	
	int saldoAtual = saldo - (debito + credito);
	
	if(saldoAtual >= 0) {
		System.out.println("Saldo Positivo");
	}else {
		System.out.println("Saldo Negativo");
	}
	return saldoAtual;
}
}