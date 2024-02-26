package tarefa01;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		// Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Vamos descobrir a area do triangulo!");
			System.out.print("Digite a base do triangulo: ");
			float baseTriangulo = sc.nextFloat();
			
			System.out.print("Digite a altura do triangulo: ");
			float alturaTriangulo = sc.nextFloat();
			
			float calc = (baseTriangulo * alturaTriangulo) / 2;
			System.out.println("A area do triangulo (" + baseTriangulo + " * " + alturaTriangulo + ")/2 = " + calc);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
	
}
