package tarefa06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um numero para descobrirmos se e impar ou par:");
			int num = sc.nextInt();
			
			sc.close();
			 if(num == 0) {
		            System.out.println(num + " zero");
		        } else if(num % 2 == 0) {
		            System.out.println(num + " par");
		        } else {
		            System.out.println(num + " impar");
		        }
		} catch (Exception e) {
			System.err.println("Digite um valor valido! ");
		}
	}

}
