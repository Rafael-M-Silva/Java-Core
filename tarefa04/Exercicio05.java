package tarefa04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real. 
		// O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Vamos fazer a conversão do Real para Dolar!");
		System.out.println("Qual a cotacao do Dolar?");
		float cotacaoDolar = sc.nextFloat();
		
		System.out.println("Quantidade de Reais?");
		float qtdDolar = sc.nextFloat();
		
		float dolarToReal = cotacaoDolar * qtdDolar;
		
		System.out.println("Cotacao atual do dolar: R$" + cotacaoDolar);
		System.out.println("US$ " + qtdDolar + " = R$ " + dolarToReal);
		sc.close();

	}

}
