package tarefa05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
	
	static void handleValueInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		int secondNumber = sc.nextInt();
		sc.close();
		
		calcValues(firstNumber, secondNumber);
		}
	
	static void calcValues(int firstNumber, int secondNumber) {
		int[] numbers = {firstNumber, secondNumber};
		Arrays.sort(numbers);
		
		System.out.println("Valores em ordem crescente " + numbers[0] + ", " + numbers[1]);
		
	}
		

	public static void main(String[] args) {
		// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
		handleValueInput();
	}

}
