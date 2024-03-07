package tarefa03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 //  Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
		 //  e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B 
		 //  e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor:");
		int A = sc.nextInt();
		
		System.out.println("Segundo valor:");
		int B = sc.nextInt();
		
		System.out.println("Primeiro valor = " + A);
		System.out.println("Segundo valor = " + B);
		
		int valorAntigo = A;
		
		A = B;
		B = valorAntigo;
		
		System.out.println("Primeiro valor trocado = " + A);
		System.out.println("Segundo valor trocado = " + B);
		
		sc.close();

	}

}
