package exercicio24;

public class Run {

	public static void main(String[] args) {
		
		double salarioTotal;
		
		//Criando objeto
		Exercicio24 exercicio = new Exercicio24();
		exercicio.calcularSalario(1000,1501);
		
		//Por ser estático o método pode ser chamado sem uma instância
		Exercicio24.calcularSalario(1000, 1400);
		

	}

}
