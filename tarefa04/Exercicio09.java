package tarefa04;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também 
		// o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).
		
	float SM, PR, NS;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual salario mensal atual do funcionario? ");
		SM = sc.nextFloat();
		
		System.out.println("Qual percentual de reajuste para o novo salario? ");
		PR = sc.nextFloat();
		
		NS = (PR * SM / 100) + SM;
		
		System.out.println("Salario antigo: R$" + SM);
		System.out.println("Novo salario: R$" + NS);
		
		sc.close();
	}

}
