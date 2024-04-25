package tarefa12;

import java.util.Scanner;



public class Exercicio09 {
	static boolean isTriangulo(int A, int B, int C) {
		if(A == B && A == C && B == C) {
			return true;
		}
		if(A + B < C) {
			return true;
		}else if(A + C < B) {
			return true;
		}else if(B + C < C) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Verificar Triângulo: Implemente um método que receba três números inteiros como argumentos 
		// e retorne verdadeiro se eles podem ser os comprimentos dos lados de um triângulo, e falso caso contrário.
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero");
			int ladoMenorA = sc.nextInt();
			
			System.out.println("Digite outro numero");
			int ladoMenorB = sc.nextInt();
			
			System.out.println("Digite outro numero");
			int ladoMaior = sc.nextInt();
			
			sc.close();
			System.out.println();
			if(isTriangulo(ladoMenorA, ladoMenorB, ladoMaior)) {
				System.out.println("Verdadeiro (TRIANGULO)");
				return;
			}
			System.out.println("Falso (NAO TRIANGULO)");
		} catch (Exception e) {
			System.err.println("Digito invalido!");
		}
	}

}
