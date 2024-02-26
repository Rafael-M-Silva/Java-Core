package tarefa01;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Basta digitar as bases e a altura do trapézio abaixo e depois clicar em \"Calcular Área\".");
			
			System.out.print("Base Maior: ");
			float baseMaior = sc.nextFloat();
			System.out.print("Base Menor: ");
			float baseMenor = sc.nextFloat();
			System.out.print("Altura: ");
			float altura = sc.nextFloat();
			
			float calc = (baseMaior + baseMenor) * altura / 2;
			System.out.println("A area do losango (" + baseMaior + " + " + baseMenor + ")*" + altura + "/2 = " + calc);
			sc.close();
		} catch (Exception e) {
			System.out.println("Digite um valor valido!");
		}
	}
}
