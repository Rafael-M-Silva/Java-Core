package tarefa06;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int number1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int number2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int number3 = sc.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		int number4 = sc.nextInt();
		
		System.out.println("Digite o quinto numero: ");
		int number5 = sc.nextInt();
		
		int[] numbers = {number1, number2, number3, number4, number5};
		
		System.out.println("Numeros digitados = " + numbers[0] + " - " + numbers[1] + " - " + numbers[2] + " - " + numbers[3] + " - " + numbers[4]);
		
		Arrays.sort(numbers);
		
		System.out.println("Maior numero = " + numbers[numbers.length - 1]);
		System.out.println("Menor numero = " + numbers[0]);
		
		sc.close();

	}

}
