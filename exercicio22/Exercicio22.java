package exercicio22;

public class Exercicio22 {
	public static float calcularSalario(int horasTrabalhadas, int salarioHora) {
	
	/*
	 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio
	 * que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
	 * hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero
	 * de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total
	 * do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido
	 * trabalhadas (considere que o m�s possua 4 semanas exatas).
	 */
	
	float salarioTotal;
	
	if(horasTrabalhadas > 160) {
		salarioTotal = (horasTrabalhadas * salarioHora)+(horasTrabalhadas-160)*salarioHora*0.5f;
		System.out.println("O sal�rio total � de: "+ salarioTotal);
	}else {
		salarioTotal = horasTrabalhadas * salarioHora;
		System.out.println("O sal�rio total � de: "+ salarioTotal);
	}
	
	return salarioTotal;
	
}
	
	public static boolean temHoraExtra (int horasTrabalhadas) {
		
		boolean horaExtra;
		
		if(horasTrabalhadas > 160) {
			horaExtra = true;
		}else {
			horaExtra = false;
		}
		return horaExtra;
	} 
	
	
	
}