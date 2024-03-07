package tarefa03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		 // Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
		 // A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 
		
		float grausCelsius, grausFahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("temperatura em graus Fahrenheit: ");
		grausFahrenheit = sc.nextFloat();
		
		grausCelsius = (grausFahrenheit - 32) * (5.0f/9.0f);
		
		System.out.println(grausFahrenheit + "F = " + grausCelsius + "C");

		sc.close();
	}

}
