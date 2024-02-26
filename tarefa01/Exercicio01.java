package tarefa01;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um valor para descobrir o sucessor: ");
			int value = sc.nextInt();
			int successorValue = value + 1;
			System.out.println("O sucessor do valor " + value + " = " + successorValue);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
		
		
	}
}
