package exercicio22;

public class Run {
	public static void main (String[]args) {
		
		//Criando objeto
		Exercicio22 exercicio = new Exercicio22();
		exercicio.calcularSalario(161, 20);
		
		//Por ser est�tico o m�todo pode ser chamado sem uma inst�ncia
		Exercicio22.calcularSalario(160, 20);
		
		//exercicio.temHoraExtra(160);
		System.out.println(exercicio.temHoraExtra(160));
		
		
		
	}
}
