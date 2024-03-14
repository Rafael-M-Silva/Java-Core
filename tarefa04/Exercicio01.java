package tarefa04;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização 
		// do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas 
		// e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar 
		// seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.
		int A, B, C, D;
		int aBSoma, aCSoma, aDSoma, bCSoma, bDSoma, cDSoma, aBMult, aCMult, aDMult, bCMult, bDMult, cDMult;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		
		System.out.println("Digite o Segundo valor: ");
		B = sc.nextInt();
		
		System.out.println("Digite o Terceiro valor: ");
		C = sc.nextInt();
		
		System.out.println("Digite o Quarto valor: ");
		D = sc.nextInt();
		
		aBSoma = A + B;
		aCSoma = A + C;
		aDSoma = A + D;
		bCSoma = B + C;
		bDSoma = B + D;
		cDSoma = C + D;
		
		aBMult = A * B;
		aCMult = A * C;
		aDMult = A * D;
		bCMult = B * C;
		bDMult = B * D;
		cDMult = C * D;
		
		System.out.println("Res: A + B : " + aBSoma);
		System.out.println("Res: A + C : " + aCSoma);
		System.out.println("Res: A + D : " + aDSoma);
		System.out.println("Res: B + C : " + bCSoma);
		System.out.println("Res: B + D : " + bDSoma);
		System.out.println("Res: C + D : " + cDSoma);
		System.out.println("Res: A * B : " + aBMult);
		System.out.println("Res: A * C : " + aCMult);
		System.out.println("Res: A * D : " + aDMult);
		System.out.println("Res: B * C : " + bCMult);
		System.out.println("Res: B * D : " + bDMult);
		System.out.println("Res: C * D : " + cDMult);
		
		
		sc.close();

	}

}
