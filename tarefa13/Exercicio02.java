package tarefa13;

public class Exercicio02 {

	static double quadrado(int num) {
		double numQuadrado = Math.pow(num, 2);
		return numQuadrado;
	}
	public static void main(String[] args) {
		// Calcular o quadrado de um número: Desenvolva um método que receba um número como argumento e retorne o quadrado desse número.

		int num = 5;
	
		System.out.println("quadrado de " + num + " = " + quadrado(num));
	}

}
