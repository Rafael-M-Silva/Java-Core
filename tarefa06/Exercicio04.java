package tarefa06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado,
		// se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com 
		// o valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado em exame.
		// Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar 
		// com as mensagens o valor da média do aluno, para qualquer condição.
		float nota1, nota2, nota3, nota4, media, notaExame;
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeira nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Terceira nota: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Quarta nota: ");
		nota4 = sc.nextFloat();
		
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Nota Exame: ");
			notaExame = sc.nextFloat();
			
			media += notaExame;
			
			if(media >= 5) {
				System.out.println("Aluno foi aprovado em exame");
			}else {
		        System.out.println("Aluno reprovado.");
		    }
		}
		sc.close();
	}

}
