package tarefa03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		 // Escreva um algoritmo para ler o salário mensal atual de um funcionário
		 // e o percentual de reajuste. Calcular e escrever o valor do novo salário.
		 
		float salarioAtual, reajuste, salarioAjustado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual salario mensal atual do funcionario? ");
		salarioAtual = sc.nextFloat();
		
		System.out.println("Qual percentual de reajuste para o novo salario? ");
		reajuste = sc.nextFloat();
		
		salarioAjustado = (reajuste * salarioAtual / 100) + salarioAtual;
		
		System.out.println("Salario antigo: R$" + salarioAtual);
		System.out.println("Novo salario: R$" + salarioAjustado);
		
		sc.close();
	}

}
