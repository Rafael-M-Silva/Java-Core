package tarefa11;

public class Exercicio04 {

	public static void main(String[] args) {
		// Vetor Invertido: Implemente um programa que inverta a ordem dos elementos em um vetor.
		int[] numeros = {1, 2, 3, 4, 5};
		int[] inverseArrayNumeros = new int[numeros.length];
		
		for(int i = numeros.length, j = 0; i > 0; i--, j++) {
			inverseArrayNumeros[j] = numeros[i - 1];
		}
		
		for(int i : inverseArrayNumeros) {
			System.out.print(i + " ");
		}
	}

}
