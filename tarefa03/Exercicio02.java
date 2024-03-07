package tarefa03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		 // Escreva um algoritmo para ler o número total de eleitores de um município,
		 // o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

		int votosBrancos, votosNulos, votosValidos, totalEleitores;
		float porcentagemVotosBrancos, porcentagemVotosNulos, porcentagemVotosValidos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual numero total de votos Brancos: ");
		votosBrancos = sc.nextInt();
		
		System.out.println("Qual numero total de votos Nulos: ");
		votosNulos = sc.nextInt();
		
		System.out.println("Qual numero total de votos Validos: ");
		votosValidos = sc.nextInt();
		
		totalEleitores = votosBrancos + votosNulos + votosValidos;
		
		porcentagemVotosBrancos = ((float)votosBrancos / totalEleitores) * 100;
		porcentagemVotosNulos = ((float)votosNulos / totalEleitores) * 100;
		porcentagemVotosValidos = ((float)votosValidos / totalEleitores) * 100;
		
		System.out.println("Total de votos : " + totalEleitores);
		System.out.println("Total votos Brancos: " + porcentagemVotosBrancos + "%");
		System.out.println("Total votos Nulos: " + porcentagemVotosNulos + "%");
		System.out.println("Total votos Validos: " + porcentagemVotosValidos + "%");
		
		sc.close();
	}

}
