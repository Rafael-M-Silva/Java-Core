package tarefa01;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Basta digitar as diagonais do losango abaixo e depois clicar em \"Calcular Área\".");
			System.out.print("Diagonal 1: ");
			float diagonal1 = sc.nextFloat();
			
			System.out.print("Diagonal 2: ");
			float diagonal2 = sc.nextFloat();
			
			float calc = (diagonal1 * diagonal2) / 2;
			
			System.out.println("A area do losango ("+ diagonal1 + " * " + diagonal2 + ")/2 = " + calc);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
