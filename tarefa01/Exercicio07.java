package tarefa01;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Vamos calcular a base do retangulo!");
			
			System.out.print("Digite a base maior: ");
			float baseMaior = sc.nextFloat();
			System.out.print("Digite a base menor: ");
			float baseMenor = sc.nextFloat();

			float calc = baseMaior * baseMenor;
			
			System.out.println("A base do retangulo tem: " + calc + "m²");
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
