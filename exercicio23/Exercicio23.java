package exercicio23;

public class Exercicio23 {
	
    public static boolean validaSexo (char sexo) {
    	
    	
    	boolean validaSexo = false;
    	
    	if( sexo == 'f' ||  sexo == 'F'||  sexo == 'm' ||  sexo == 'M') {
    		validaSexo = true;
    	}
    	

    	return validaSexo;
    }
	
	
	public static double calcularPesoIdeal (String nome, double altura, char sexo) {
		
	/*
	 * Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa,
	 * calcule e mostre seu peso ideal, utilizando as seguintes fórmulas: - para
	 * sexo masculino: peso ideal = (72.7 * altura) - 58 - para sexo feminino: peso
	 * ideal = (62.1 * altura) - 44.7
	 */
	
	
	
	double pesoIdeal;
	
	boolean verificarSexo = validaSexo(sexo);
	
	
	if (  !verificarSexo ) {
		return -1;
	}
	
	
	if(sexo == 'M' | sexo == 'm'){
	pesoIdeal = (72.7 * altura) - 58 ;
	}else {
	pesoIdeal =(62.1 * altura) - 44.7 ;
	}
	
	
	return pesoIdeal;

	
	
}

	
	
	
	
	

}