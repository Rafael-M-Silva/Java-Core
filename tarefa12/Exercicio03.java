package tarefa12;

import java.util.Scanner;

public class Exercicio03 {

	static boolean isPalindromo(String name) {
		String nameReverse = new StringBuilder(name).reverse().toString(); 
		if(name.equals(nameReverse)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// Verificar Palíndromo: Desenvolva um método que receba uma string 
		// como entrada e retorne verdadeiro se ela for um palíndromo 
		// (ou seja, se ela pode ser lida da mesma forma de trás para frente), e falso caso contrário.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite alguma frase para descobrir se e palindromo");
		String name = sc.next();
		
		sc.close();
		
		
		if(isPalindromo(name)) {
			System.out.println("O nome " + name + " e palindromo");
			
		}else {
			System.out.println("O nome " + name + " nao e palindromo");			
		}
	}

}
