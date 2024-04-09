package tarefa11;

import java.util.Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		// Ordenação Crescente: Implemente um algoritmo que ordene os elementos de um vetor em ordem crescente.
		
		int[] numeros = {5, 3, 7, 12, 235, 75, 1, 22};
		
		Arrays.sort(numeros);
		for (int i : numeros) {
			System.out.println(i);
		}

	}

}
