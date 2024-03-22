package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	static void getValueHoursWork() {
		try {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Quantas horas trabalhada em 1 mes? ");
			int hoursWork = sc.nextInt();
			
			System.out.println("Qual o salario por hora trabalhada? ");
			int salaryHour = sc.nextInt();
			
			sc.close();
			
			calcHourExtra(hoursWork, salaryHour);
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
			getValueHoursWork();
		}
	}
	
	static void calcHourExtra(int hoursWork, int salaryHour) {
		int hourWorkMouth = 160;	
		
		if(hoursWork > hourWorkMouth) {
			int hourExtra = (hoursWork - hourWorkMouth) * salaryHour;
		
			hourExtra += (float)(50 * hourExtra) / 100;
			
			int totalSalary = (salaryHour * hoursWork) + hourExtra;
			System.out.println("Salario total = " + totalSalary);
			return;
		}
		
		int totalSalary = salaryHour * hoursWork;
		
		System.out.println("Salario total = " + totalSalary);
	}
	
	public static void main(String[] args) {
		// A jornada de trabalho semanal de um funcionário é de 40 horas.
		// O funcionário que trabalhar mais de 40 horas receberá hora extra, 
		// cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
		// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
		// o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
		// caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

		getValueHoursWork();
	}

}