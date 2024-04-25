package tarefa13;

public class Exercicio03 {

	static void isPositivo(int num) {
		if(num == 0) {
			System.out.println(num + " = Zero");
		}else if(num > 0) {
			System.out.println(num + " = Positivo");
		}else {
			System.out.println(num + " = Negativo");
		}
	}
	
	public static void main(String[] args) {
		// Verificar se um número é positivo, negativo ou zero: Implemente um método que receba um número como parâmetro e retorne uma mensagem indicando se o número é positivo, negativo ou zero.
		
		int num = -1;
		
		isPositivo(num);

	}

}
