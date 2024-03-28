package tarefa06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, 
		// apresentando as duas raízes, se para os valores informados for possível efetuar o referido cálculo. Lembre-se de que 
		// a variável A deve ser diferente de zero.
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor: ");
			float A = sc.nextFloat();
			
			System.out.println("Digite o segundo valor: ");
			float B = sc.nextFloat();
			
			System.out.println("Digite o terceiro valor: ");
			float C = sc.nextFloat();
			
			sc.close();
			
			if(A != 0) {
			double delta = (Math.pow(B, 2)) - 4 * A * C;
				
				System.out.println("Resultado = " + delta);
				return;
			}
			
			System.out.println("Valor do A foi 0 e isso torna a equação do primeiro grau");	
		} catch (Exception e) {
			System.err.println("Digite um valor valido!");
		}
		
	}

}
