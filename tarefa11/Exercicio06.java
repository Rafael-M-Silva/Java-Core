package tarefa11;


public class Exercicio06 {

	 public static void main(String[] args) {
		// Frequência de Elementos: Crie um programa que determine a 
		// frequência de cada elemento único em um vetor.
	     int[] numeros = {1, 2, 3, 4, 1, 2, 2, 5, 6, 2, 3, 1, 4};
	     
	     for(int i = 0; i < numeros.length; i++) {
	         int cont = 0;
	         for(int j = 0; j < numeros.length; j++) {
	             if(numeros[i] == numeros[j]) {
	                 cont++;
	             }
	         }
	       
	         boolean repetido = false;
	         for (int k = 0; k < i; k++) {
	             if (numeros[k] == numeros[i]) {
	                 repetido = true;
	                 break;
	             }
	         }
	         if (!repetido) {
	             System.out.println("Numero " + numeros[i] + " aparece " + cont + " vezes!");
	         }
	     }
	 }
	}

