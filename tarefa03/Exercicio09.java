package tarefa03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
		
		Scanner sc = new Scanner(System.in);
		int taxa = 4;
		
		System.out.println("====== PRESTACAO EM ATRASO ======");
		System.out.println("Taxa: 4 Reais");
		System.out.println("Qual valor da prestacao?");
		float valorPrestacao = sc.nextFloat();
		
		System.out.println("Quantos dias de atraso? ");
		int diaAtraso = sc.nextInt();
		
		float valorPrestacaoAtraso = valorPrestacao + (valorPrestacao * taxa/100) * diaAtraso;
		
		System.out.println("Valor da prestacao em atraso ficou: R$" + valorPrestacaoAtraso);
		sc.close();

	}

}
