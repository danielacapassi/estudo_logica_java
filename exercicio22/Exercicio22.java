package exercicio22;

public class Exercicio22 {
	public static float calcularSalario(int horasTrabalhadas, int salarioHora) {
	
	/*
	 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
	 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
	 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
	 * de horas trabalhadas em um mês, o salário por hora e escreva o salário total
	 * do funcionário, que deverá ser acrescido das horas extras, caso tenham sido
	 * trabalhadas (considere que o mês possua 4 semanas exatas).
	 */
	
	float salarioTotal;
	
	if(horasTrabalhadas > 160) {
		salarioTotal = (horasTrabalhadas * salarioHora)+(horasTrabalhadas-160)*salarioHora*0.5f;
		System.out.println("O salário total é de: "+ salarioTotal);
	}else {
		salarioTotal = horasTrabalhadas * salarioHora;
		System.out.println("O salário total é de: "+ salarioTotal);
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