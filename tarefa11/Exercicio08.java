package tarefa11;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Buscar Elemento: Escreva um programa que verifique se um determinado elemento está presente em um vetor.
		
		int[] numeros = {1, 23, 43, 54, 58, 60, 27, 18, 29, 130 ,11 , 12, 13};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Buscador de Elemento: Digite um numero: ");
		int num = sc.nextInt();
		
		sc.close();
		
		for (int i : numeros) {
			if(num == i) {
				System.out.println("Numero " + i + " Existe!");
				return;
			}
		}
		System.out.println("Numero " + num + " nao existe!");
		
	}
}
