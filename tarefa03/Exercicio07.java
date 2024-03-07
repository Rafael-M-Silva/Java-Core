package tarefa03;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        // Calcular e apresentar o valor do volume de uma lata de óleo,
        // utilizando a fórmula: Volume = π*Raio^2*Altura
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Por favor, insira o raio da lata de oleo:");
        float raio = sc.nextFloat();
        
        System.out.println("Agora, por favor, insira a altura da lata de oleo:");
        float altura = sc.nextFloat();  
   
        double calc = (Math.PI * Math.pow(raio, 2) * altura);
        
        System.out.println("O volume da lata de oleo é: " + calc);
        
        sc.close();
    }

}
