package exercicio24;

public class Exercicio24 {
	public static double calcularSalario(int salarioFixo, int vendasEfetuadas) {
	
	/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
	 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 
	 *  mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.*/
	

	double salarioTotal;
	
	if(vendasEfetuadas <= 1500) {
	salarioTotal = salarioFixo + (vendasEfetuadas * 0.03);
	System.out.println("O salário total é de: " + salarioTotal);
			} else {
	salarioTotal = salarioFixo + (vendasEfetuadas * 0.05);	
	System.out.println("O salário total é de: " + salarioTotal);
			}
	return salarioTotal;
	
}
}