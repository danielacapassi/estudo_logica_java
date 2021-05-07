package exercicio25;

public class Exercicio25 {
	
	public static int calcularSaldo ( int saldo, int debito, int credito) {
	/*
	 * Faça um algoritmo para ler:  saldo, débito e
	 * crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo -
	 * débito + crédito). Também testar se saldo atual for maior ou igual a zero
	 * escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
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