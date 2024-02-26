package tarefa01;
import java.util.Scanner;

public class Exercicio02 {
	//Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um valor para saber o antecessor: ");
			int valor = sc.nextInt();
			int antecessor = valor - 1;
			System.out.println("O valor antecessor do " + valor + " = " + antecessor);
			
			sc.close();
		} catch (Exception e) {
			System.out.println("Valor invalido!");
		}	
	}
}
