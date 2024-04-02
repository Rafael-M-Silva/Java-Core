package tarefa11;

public class Exercicio01 {

	public static void main(String[] args) {
		// Soma dos Elementos: Escreva um programa que calcule a soma de todos os elementos de um vetor de inteiros.
		int[] valores = {1, 2, 3, 4, 5};
		int soma = 0;
		for (int i : valores) {
			soma += i;
		}
		System.out.println(soma);
	}
}
