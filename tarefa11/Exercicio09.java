package tarefa11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		// Remover Elemento: Desenvolva um programa que remova todas as ocorrências de um elemento específico de um vetor.

		Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 for(int i = 1; i <= 10; i++) {
	            numeros.add(i);
	       }
		 
		System.out.println("Numeros disponiveis para remover");
		System.out.println(numeros);
		System.out.println();
		
		System.out.println("Qual numero você deseja remover?");
		int removeNum = numeros.indexOf(sc.nextInt());
		
		numeros.remove(removeNum);
		
		System.out.println();
		System.out.println("Item removido com sucesso!");
		System.out.println(numeros);
		
		sc.close();
	}

}


   
