package exercicio25;


public class Run {

	public static void main(String[] args) {
		//Criando objeto
		Exercicio25 exercicio = new Exercicio25();
		exercicio.calcularSaldo(200, 80, 100);
		
		//Por ser estático o método pode ser chamado sem uma instância
		Exercicio25.calcularSaldo(300, 70 , 300);
}
}