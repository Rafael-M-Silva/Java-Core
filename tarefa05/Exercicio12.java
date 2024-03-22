package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	static void getValueQtdProductInStock() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantidade atual de produtos no estoque? ");
			int currentQtd = sc.nextInt();
			
			System.out.println("Quantidade Maxima de produtos no estoque? ");
			int currentMax = sc.nextInt();
			
			System.out.println("Quantidade minima de produtos no estoque? ");
			int currentMin = sc.nextInt();
			
			
			sc.close();
			
			calcMediaProductInStock(currentMax, currentMin, currentQtd);
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}
	
	static void calcMediaProductInStock(int currentMax, int currentMin, int currentQtd) {
		int qtdMedia = (currentMax + currentMin) / 2;
		
		if(currentQtd >= qtdMedia) {
			System.out.println("Nao efetuar compra!");
			return;
		}
		System.out.println("Efetuar compra!");
	}
	
	public static void main(String[] args) {
		// Faça um algoritmo para ler: quantidade atual em estoque,
		// quantidade máxima em estoque e quantidade mínima em estoque de um produto.
		// Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2).
		// Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
		// senão escrever a mensagem 'Efetuar compra'.

		getValueQtdProductInStock();
	}

}
