package tarefa11;

import java.util.ArrayList;

public class Exercicio10 {

	public static void main(String[] args) {
		// União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.
		int[] array1 = {22, 32, 11, 2, 6, 7};
		int[] array2 = {7,8,9,10};
		
		ArrayList<Integer> arraysGroup = new ArrayList<Integer>();
		
		for(int i = 0; i < array1.length; i++) {
			arraysGroup.add(array1[i]);
		}
		
		for(int j = 0 ; j < array2.length; j++) {
			arraysGroup.add(array2[j]);
		}
		System.out.println(arraysGroup);
		
	}

}
