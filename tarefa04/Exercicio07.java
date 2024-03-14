package tarefa04;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//  Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.

		float primeiroValor, segundoValor, terceiroValor, resultado, somaQuadrados;
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro valor: ");
		primeiroValor = sc.nextFloat();
		
		System.out.println("Segundo valor: ");
		segundoValor = sc.nextFloat();
		
		System.out.println("Terceiro valor: ");
		terceiroValor = sc.nextFloat();
		
		somaQuadrados = primeiroValor + segundoValor + terceiroValor;
		
		resultado = (float) Math.pow(somaQuadrados, 2);
		
		System.out.println("Resultado da soma dos quadrados dos 3 valores = " + resultado);
		
		sc.close();
	}

}
