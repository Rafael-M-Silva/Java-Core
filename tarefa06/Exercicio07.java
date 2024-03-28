package tarefa06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite primeiro valor: ");
		int number1 = sc.nextInt();
		
		System.out.println("Digite segundo valor: ");
		int number2 = sc.nextInt();
		
		System.out.println("Digite terceiro valor: ");
		int number3 = sc.nextInt();
		
		System.out.println("Digite quarto valor: ");
		int number4 = sc.nextInt();
		
		sc.close();

		int[] numbers = {number1, number2, number3, number4};
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " divisivel por 2");
			}if(numbers[i] % 3 == 0) {
				System.out.println(numbers[i] + " divisivel por 3");
			}
		}
	}

}
