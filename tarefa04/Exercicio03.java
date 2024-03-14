package tarefa04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
    	//Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro (A): ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o segundo numero inteiro (B): ");
        int B = scanner.nextInt();
        
        int diferenca = A - B;
        int quadradoDiferenca = diferenca * diferenca;
        
        System.out.println("O quadrado da diferenca entre " + A + " e " + B + " é: " + quadradoDiferenca);
        
        scanner.close();
    }
}
