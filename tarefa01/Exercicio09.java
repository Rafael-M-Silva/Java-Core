package tarefa01;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Descubra a area do quadrado!");
			System.out.print("Qual tamanho do lado? ");
			
			int ladoQuadrado = sc.nextInt();
			int calc = ladoQuadrado * ladoQuadrado;
			
			System.out.println("A area do quadrado (" + ladoQuadrado + " * " + ladoQuadrado + ") = " + calc);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
