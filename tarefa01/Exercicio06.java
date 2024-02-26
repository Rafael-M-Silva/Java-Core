package tarefa01;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vamos fazer a divisao dos dois valores!");
			System.out.print("Digite o primeiro Valor: ");
			float primeiroValor = sc.nextFloat();
			System.out.print("Digite o segundo Valor: ");
			float segundoValor = sc.nextFloat();
			
			float divisao = primeiroValor / segundoValor;
			System.out.println("A divisao dos valores = " + divisao);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
