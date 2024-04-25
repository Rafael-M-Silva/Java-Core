package tarefa12;

import java.util.Scanner;

public class Exercicio07 {
	
	static boolean isBissexto(int ano) {
		if(ano % 4 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Verificar Ano Bissexto: Desenvolva um método que determine se um ano é bissexto ou não.
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um ano para descobrir se e bissexto!");
			int ano = sc.nextInt();
			sc.close();
			
			if(isBissexto(ano)) {
				System.out.println(ano + " e bissexto");			
				return;
			}
			System.out.println(ano + " nao e bissexto");
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}
}