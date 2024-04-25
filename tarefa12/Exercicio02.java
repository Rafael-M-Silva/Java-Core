package tarefa12;

import java.util.Scanner;

public class Exercicio02 {
	
	static void calcFatorial(int num) {
		int fatorial = 1;
		for(int i = num; i >= 1; i--) {
			fatorial *= i;
		}
		System.out.println("======= Fatoria do "+ num +" =========");
		System.out.println(num + "      " + fatorial);
}

	public static void main(String[] args) {
		// Calcular Fatorial: Escreva um método para calcular o fatorial de um número inteiro positivo passado como parâmetro.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		calcFatorial(num);
	}

}
