package tarefa04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
		// O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos fazer a conversão do Dolar para Real!");
		System.out.println("Qual a cotacao do Dolar?");
		float cotacaoDolar = sc.nextFloat();
		
		System.out.println("Quantidade de Dolar?");
		float qtdDolar = sc.nextFloat();
		
		float dolarToReal = cotacaoDolar * qtdDolar;
		
		System.out.println("Cotacao atual do dolar: R$" + cotacaoDolar);
		System.out.println("US$ " + qtdDolar + " = R$ " + dolarToReal);
		sc.close();
	}

}
