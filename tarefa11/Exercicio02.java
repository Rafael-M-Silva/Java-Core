package tarefa11;

import java.util.Arrays;

public class Exercicio02 {

	public static void main(String[] args) {
		// Maior e Menor Valor: Crie um programa que encontre o maior e o menor valor em um vetor de números inteiros.
		int[] valores = {4, 2, 23, 12, 5};
		
		for(int i: valores) {
			System.out.println("Valor " + i);
		}
		
		Arrays.sort(valores);
		
		System.out.println();
		System.out.println("Maior valor " + valores[valores.length - 1]);
		System.out.println("Menor valor " + valores[0]);
	}

}
