package tarefa06;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        // Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.
        
       try {
    	   Scanner sc = new Scanner(System.in);
           
           System.out.println("Digite o primeiro valor: ");
           int A = sc.nextInt();
           
           System.out.println("Digite o segundo valor: ");
           int B = sc.nextInt();
           
           System.out.println("Digite o terceiro valor: ");
           int C = sc.nextInt();
           
           sc.close();

           int[] numbers = {A, B, C};
           
           Arrays.sort(numbers);
           
           System.out.println("Ordem crescente = " + " - " + numbers[0] + " - " + numbers[1] + " - " + numbers[2]);
	} catch (Exception e) {
		System.err.println("Digite um valor valido! ");
	}
    }
}
