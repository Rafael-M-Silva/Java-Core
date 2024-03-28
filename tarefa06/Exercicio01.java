package tarefa06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.
		try {
			int valorA, valorB, res;
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Digite o primeiro valor: ");
			valorA = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			valorB = sc.nextInt();
			
			res = valorA - valorB;
			
			System.out.println("Primeiro valor = " + valorA);
			System.out.println("Segundo valor = " + valorB);
			System.out.println("Diferenca de = " + Math.abs(res));
			sc.close();
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}
}
