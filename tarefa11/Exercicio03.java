package tarefa11;

public class Exercicio03 {

	public static void main(String[] args) {
		// Média dos Elementos: Desenvolva um programa que calcule a média dos elementos em um vetor de números reais.

		float[] numeros = {(float) 1.4,(float)4.2,(float)12.7,(float)34.3,(float)9.1};
		float soma = 0;
		float media = 0;
		
		for(float i : numeros) {
			soma += i;
			media = soma / numeros.length;
		}
		System.out.println("Media = " + media);
	}
}
