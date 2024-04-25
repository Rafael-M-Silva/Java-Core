package tarefa13;

public class Exercicio01 {

	static boolean isPar(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// Verificar se um número é par ou ímpar: Crie um método que receba um número inteiro como parâmetro e retorne verdadeiro se o número for par e falso se for ímpar.
		int num = 8;
		
		if(isPar(num)) {
			System.out.println("O numero " + num + " e par");
			return;
		}
		System.out.println("O numero " + num + " e impar");
	}

}
