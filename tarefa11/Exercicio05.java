package tarefa11;

public class Exercicio05 {

	public static void main(String[] args) {
		// Elementos Pares: Escreva um programa que conte e exiba a
		// quantidade de números pares em um vetor de inteiros.

		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int cont = 0;
		
		for(int i : numeros) {
			if(i % 2 == 0) {
				cont++;
				System.out.println(i + " ");
			}
		}
		System.out.println();
		System.out.println(cont + " numeros pares");
	}

}
