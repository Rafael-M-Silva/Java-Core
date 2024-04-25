package tarefa13;

public class Exercicio05 {
	
	static boolean isBissexto(int ano) {
		if(ano % 4 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		//  Verificar se um ano é bissexto: Desenvolva um método que receba um ano como argumento e retorne verdadeiro se o ano for bissexto e falso caso contrário.

		int ano = 2020;
		
		if(isBissexto(ano)) {
			System.out.println(ano + " = Bissexto");
			return;
		}
		System.out.println(ano + " = nao e Bissexto");
	}

}
