package tarefa06;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens:
		// "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também 
		// junto da mensagem de saudação o nome previamente informado.
		
           try {
       		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Digite seu nome ");
    		String nome = sc.next();
    		
    		System.out.println("===== Qual seu Sexo =====");
    		System.out.println("[1] Masculino ");
    		System.out.println("[2] Feminino ");
    		System.out.println("=========================");
    		int sexo = sc.nextInt();
    		
    		sc.close();

    		if(sexo == 1) {
    			System.out.println("Sr " + nome);
    			return;
    		}
    		if(sexo == 2) {
    			System.out.println("Sra " + nome);
    			return;
    		}
    		System.out.println("Caro " + nome + " nao existe essa opção!");
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
	}

}
