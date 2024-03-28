package tarefa06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		//Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor");
			int valor = sc.nextInt();
			
			sc.close();
			if(valor <= 3) {
				System.out.println("O incrivel numero " + valor);
				return;
			}
			
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}

}
