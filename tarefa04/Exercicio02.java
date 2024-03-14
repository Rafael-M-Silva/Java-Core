package tarefa04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Elaborar um programa que calcule e apresente o volume de uma caixa retangular, 
		// por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("programa que calcule e apresente o volume de uma caixa retangular");
		System.out.println("Qual comprimento da caixa? ");
		float comprimento = sc.nextFloat();
		
		System.out.println("Qual largura da caixa? ");
		float largura = sc.nextFloat();
		
		System.out.println("Qual altura da caixa? ");
		float altura = sc.nextFloat();
		
		float volume = comprimento * largura * altura;
		
		System.out.println("Volume da caixa retangular = " + volume);
		
		sc.close();
	}

}
