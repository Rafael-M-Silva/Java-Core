package tarefa12;

import java.util.Scanner;

public class Exercicio08 {

	static double calcPotencia(int base, int expoente) {
		double calc = Math.pow(base, expoente);
		return calc;
	}
	
	public static void main(String[] args) {
		// Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Calcular potencia: ");
			System.out.println("======================");
			
			System.out.println("Digite o valor da base: ");
			int base = sc.nextInt();
			
			System.out.println("Digite o expoente:");
			int expoente = sc.nextInt();
			
			sc.close();
			
			System.out.println(calcPotencia(base, expoente));
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}

}
