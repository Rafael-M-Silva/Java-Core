package tarefa12;

import java.util.Scanner;

public class Exercicio10 {
    
    static double mediaPonderada(int valor1, int valor2, int valor3, int peso1, int peso2, int peso3) {
        double media = (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / (peso1 + peso2 + peso3);
        return media;
    }
    
    public static void main(String[] args) {
        // Calcular Média Ponderada: Escreva uma função que calcule a média ponderada de três valores,
        // onde os pesos são passados como argumentos.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primeiro valor:");
        int valor1 = sc.nextInt();
        
        System.out.println("Segundo valor:");
        int valor2 = sc.nextInt();
        
        System.out.println("Terceiro valor:");
        int valor3 = sc.nextInt();
        
        System.out.println("Peso para o primeiro valor:");
        int peso1 = sc.nextInt();
        
        System.out.println("Peso para o segundo valor:");
        int peso2 = sc.nextInt();
        
        System.out.println("Peso para o terceiro valor:");
        int peso3 = sc.nextInt();
        
        sc.close();
        
        double media = mediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
        
        System.out.println("A média ponderada é: " + media);
    }
}
