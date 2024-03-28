package tarefa06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, 
		// o programa deverá apresentar o módulo de um número fornecido. Lembre-se de verificar se o número fornecido é menor que zero;
		// sendo, multiplique-o por -1.
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		valor = sc.nextInt();
		
		System.out.println("O valor absoluto é: " + Math.abs(valor));
		sc.close();

	}

}
