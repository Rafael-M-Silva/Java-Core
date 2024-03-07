package tarefa03;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.


    	int idadeAnos, idadeMeses, idadeDias, diasVividos;
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual sua idade expressa em anos? ");
        idadeAnos = sc.nextInt();
        
        System.out.println("Quantos meses já passou do seu ultimo mesversario? ");
        idadeMeses = sc.nextInt();
        
        System.out.println("Quantos dias falta pra completar o proximo mes? ");
        idadeDias = sc.nextInt();
        
        diasVividos = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
        
        System.out.println("Voce tem " + diasVividos + " dias vividos.");
     
        sc.close();
    }

   
}
