package tarefa12;


import java.util.Scanner;

public class Exercicio01 {

    static void numUser(int num) {
}
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Verificar Número Primo: Crie um método que receba um número inteiro
        // como argumento e retorne verdadeiro se o número for primo, e falso caso contrário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int number = sc.nextInt();

        sc.close();
       
        if (isPrime(number)) {
            System.out.println(number + " e um numero primo.");
        } else {
            System.out.println(number + " nao e um numero primo.");
        }
    }
    
}

