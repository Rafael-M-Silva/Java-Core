package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor ");
		int valor = sc.nextInt();
		
		sc.close();
		if(valor > 10) {
			System.out.println("Maior que 10!");
			return;
		}
		System.out.println("Nao e maior que 10!");
	}

}
