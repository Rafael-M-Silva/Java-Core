package tarefa05;

import java.util.Scanner;

public class Exercicio06 {
	
	static void handleUserInput() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor: ");
			int firstValue = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int secondValue = sc.nextInt();
			
			sc.close();
			
			calcValues(firstValue, secondValue);
		} catch (Exception e) {
			System.err.println("Valor invalido. Tente novamente!");
			handleUserInput();
		}
	}
	
	static void calcValues(int firstValue, int secondValue) {
		if(firstValue == secondValue) {
			System.out.println("Numeros iguais!");
		}else if(firstValue > secondValue) {
			System.out.println(firstValue + " e maior que " + secondValue);
		}else {
			System.out.println(secondValue + " e maior que " + firstValue);
		}
	}

	public static void main(String[] args) {
		// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
		handleUserInput();
	}
}
