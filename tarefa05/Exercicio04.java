package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular a media do aluno");
		System.out.println();
		
		System.out.println("Primeira nota: ");
		float primeiraNota = sc.nextInt();
		
		System.out.println("Segunda nota: ");
		float segundaNota = sc.nextInt();
		sc.close();
		
		float media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 6) {
			System.out.println("Sua media foi " + media + " Aprovado!");
			return;
		}
		System.out.println("Sua media foi " + media + " Reprovado!");
	}

}
