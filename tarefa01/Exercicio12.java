package tarefa01;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Descubra a area do circulo!");
			System.out.print("Digite o raio: ");
			float raio = sc.nextFloat();
			double pi = Math.PI;
			double calc = pi * Math.pow(raio, 2);
			
			System.out.println("A area do circulo: " + calc);
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
