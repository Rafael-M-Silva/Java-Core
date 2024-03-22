package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

		float maca = 1.30f;
		float valorCompra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maca voce desejar comprar? ");
		int qtdMaca = sc.nextInt();
		
		sc.close();
		if(qtdMaca >= 12) {
			maca = 1;
			valorCompra = qtdMaca * maca;
			System.out.println("Voce comprou " + qtdMaca + " e custou R$" + valorCompra);
			return;
		}
		valorCompra = qtdMaca * maca;
		System.out.println("Voce comprou " + qtdMaca + " e custou R$" + valorCompra);
	}

}
