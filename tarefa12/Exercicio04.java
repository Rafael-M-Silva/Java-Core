package tarefa12;

public class Exercicio04 {

	static void calcMedia(float[] numeros) {
		float soma = 0;
		
		for (float i : numeros) {
			soma+= i;
		}
		
		float media = soma / numeros.length;
		System.out.println("A media de " + soma + " = " + media);
	}
	
	public static void main(String[] args) {
		// Calcular Média: Crie uma função que calcule a média de uma lista de números passada como parâmetro.
		float[] numeros = {1,2,3,4,5,6,7,8,9,10}; 
		calcMedia(numeros);
	}

}
