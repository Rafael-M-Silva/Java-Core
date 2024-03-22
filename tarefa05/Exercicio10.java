package tarefa05;

import java.util.Scanner;

public class Exercicio10 {
	
	static void getValueSalary() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual salario fixo?");
			float salaryFixo = sc.nextInt();
			
			System.out.println("Qual o valor das vendas efetuadas pelo vendedor de uma empresa?");
			float salesValue = sc.nextFloat();
			
			sc.close();
			
			calcTotalSalary(salaryFixo, salesValue);
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
			getValueSalary();
		}
	}
	
	static void calcTotalSalary(float salaryFixo, float salesValue) {
		int commission = 3;
		float salaryTotal;
		
		if(salesValue <= 1500) {
			salaryTotal = ((salesValue * commission) / 100) + salaryFixo;
			System.out.println("Salario = " + salaryTotal);
			return;
		}
		
		commission += 5;
		salaryTotal = ((salesValue * commission) / 100) + salaryFixo;
		
		System.out.println("Salario = " + salaryTotal);
	}

	public static void main(String[] args) {
		// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
		// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 
		// mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
		getValueSalary();
	}

}
