package tarefa05;
import java.util.Scanner;

public class Exercicio05 {

	static void perguntas() {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Qual ano você nasceu?");
			 int anoNasc = sc.nextInt();
			 
			 System.out.println("Qual ano Atual?");
			 int anoAtual = sc.nextInt();
			 
			 sc.close();
			 	
			 calculoRes(anoNasc, anoAtual);
	
		} catch (Exception e) {
			System.err.println("Dados invalidos!");
			perguntas();
		}
		
	}
	
	static void calculoRes(int anoNasc, int anoAtual) {
		 int idade = anoAtual - anoNasc;
		 
		 String res = idade >= 18 ? "Pode votar!" : "Nao pode votar!";
		 System.out.println("Idade: " + idade + " = " + res);
	 }
	 

	
	public static void main(String[] args) {
		//  Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
		perguntas();
	}
}
