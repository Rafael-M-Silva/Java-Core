package tarefa01;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		//  Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vamos fazer a subtracao dos dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			int primeiroValor = sc.nextInt();
			System.out.print("Digite o segundo Valor: ");
			int segundoValor = sc.nextInt();
			
			int subtracao = primeiroValor - segundoValor;
			System.out.println("A subtracao dos valores = " + subtracao);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
	
}
