package tarefa05;

import java.util.Scanner;

public class Exercicio11 {
	
	static void getAccountUser() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o numero da conta: ");
			int numAccount = sc.nextInt();
			
			System.out.println("Digite seu saldo: ");
			float accountBalance = sc.nextFloat();
			
			System.out.println("Digite seu debito: ");
			float accountDebit = sc.nextFloat();
			
			System.out.println("Digite seu credito: ");
			float accountCredit = sc.nextFloat();
			
			sc.close();
			
			currentBalanceUser(numAccount, accountBalance, accountCredit, accountDebit);
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
			getAccountUser();
		}
	}
	
	static void currentBalanceUser(float numAccount, float accountBalance, float accountCredit, float accountDebit) {
		float currentBalance = accountBalance - accountDebit + accountCredit;
		
		if(currentBalance >= 0) {
			System.out.println("Saldo Positivo! " + currentBalance);
			return;
		}
			System.out.println("Saldo Negativo! " + currentBalance);
	}


	public static void main(String[] args) {
		// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
		// Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
		// Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

		getAccountUser();
	}

}
