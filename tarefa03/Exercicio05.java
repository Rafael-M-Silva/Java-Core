package tarefa03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 // Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
		 // A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 
		
		float grausCelsius, grausFahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("temperatura em graus Celsius: ");
		grausCelsius = sc.nextFloat();
		
		grausFahrenheit = (9 * grausCelsius + 160) / 5;
		
		System.out.println(grausCelsius + "C = " + grausFahrenheit + " F");

		sc.close();
	}

}
