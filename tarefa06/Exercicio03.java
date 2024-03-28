package tarefa06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o 
		// aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, 
		// indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
		float nota1, nota2, nota3, nota4, media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeira nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Terceira nota: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Quarta nota: ");
		nota4 = sc.nextFloat();
		
		sc.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 5) {
			System.out.println("Media = " + media + " Aprovado!");
			return;
		}
		System.out.println("Media = " + media + " Reprovado!");
	}

}
