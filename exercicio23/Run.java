package exercicio23;

public class Run {
	
	public static void main(String[]args) {
		
		double pesoIdeal;
		
		Exercicio23 exercicio = new Exercicio23();
		pesoIdeal = exercicio.calcularPesoIdeal("joao", 1.89, 'm');
		System.out.println(pesoIdeal);
	}

}
