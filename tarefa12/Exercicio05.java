package tarefa12;

public class Exercicio05 {
	
	static void inverterString(String nome) {
		String reverseString = new StringBuilder(nome).reverse().toString();
		
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		// Inverter String: Implemente um método que inverta uma string passada como argumento.
		String nome = "Rafael";
		
		inverterString(nome);
	}
}
