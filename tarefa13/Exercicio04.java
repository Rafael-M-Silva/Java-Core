package tarefa13;

public class Exercicio04 {

	static void calcMedia(int num1, int num2, int num3) {
		float media = (num1 + num2 + num3) / 3;
		
		System.out.println(media);
	}
	public static void main(String[] args) {
		// Calcular a média de três números: Crie uma função que receba três números como parâmetros e retorne a média desses números.
		int num1 = 11;
		int num2 = 37;
		int num3 = 16;

		calcMedia(num1, num2, num3);
	}

}
