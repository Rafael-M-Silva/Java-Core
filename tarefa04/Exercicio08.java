package tarefa04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D). 
		// Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor e 
		// o resultado da soma (variável S) do segundo com o quarto valor.

		int A, B, C, D, P, S;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		A = sc.nextInt();

		System.out.println("Segundo valor: ");
		B = sc.nextInt();

		System.out.println("Terceiro valor: ");
		C = sc.nextInt();
		
		System.out.println("Quarto valor: ");
		D = sc.nextInt();
		
		P = A + C;
		S = B + D;
		
		System.out.println("Resultado P = " + P);
		System.out.println("Resultado S = " + S);
		
		sc.close();
	}

}
