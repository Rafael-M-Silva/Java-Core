package tarefa04;

import java.util.Scanner;

public class Exercicio10 {
	// Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
	// Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos 
	// válidos para cada candidato. Deve ser criado um programa de computador que efetue a leitura da 
	// quantidade de votos válidos para cada candidato, além de efetuar também a leitura da quantidade 
	// de votos nulos e votos em branco. Ao final o programa deve apresentar o número total de eleitores, 
	// considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação 
	// à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade 
	
	// de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o 
	// percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente 
	// de votos nulos em relação à quantidade de eleitores; e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.

	public static void main(String[] args) {
		
		int votosNulosA, votosBrancosA, votosValidosA, votosNulosB, votosBrancosB, votosValidosB, votosNulosC, votosBrancosC, votosValidosC, totalVotosCandidatoA, totalVotosCandidatoB, totalVotosCandidatoC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qtd de votos validos do candidato A: ");
		votosValidosA = sc.nextInt();
		
		System.out.println("Qtd de votos brancos do candidato A: ");
		votosBrancosA = sc.nextInt();
		
		System.out.println("Qtd de votos nulos do candidato A: ");
		votosNulosA = sc.nextInt();
		
		System.out.println("Qtd de votos validos do candidato B: ");
		votosValidosB = sc.nextInt();
		
		System.out.println("Qtd de votos brancos do candidato B: ");
		votosBrancosB = sc.nextInt();
		
		System.out.println("Qtd de votos nulos do candidato B: ");
		votosNulosB = sc.nextInt();
		
		System.out.println("Qtd de votos validos do candidato C: ");
		votosValidosC = sc.nextInt();
		
		System.out.println("Qtd de votos brancos do candidato C: ");
		votosBrancosC = sc.nextInt();
		
		System.out.println("Qtd de votos nulos do candidato C: ");
		votosNulosC = sc.nextInt();
		
		
		totalVotosCandidatoA = votosBrancosA + votosNulosA + votosValidosA;
		totalVotosCandidatoB = votosBrancosB + votosNulosB + votosValidosB;
		totalVotosCandidatoC = votosBrancosC + votosNulosC + votosValidosC;
		
		float percentualVotosBrancosCandidatoA = ((float)votosBrancosA / totalVotosCandidatoA) * 100;
		float percentualVotosNulosCandidatoA = ((float)votosNulosA / totalVotosCandidatoA) * 100;
		float percentualVotosValidosCandidatoA = ((float)votosValidosA / totalVotosCandidatoA) * 100;
		
		float percentualVotosBrancosCandidatoB = ((float)votosBrancosB / totalVotosCandidatoB) * 100;
		float percentualVotosNulosCandidatoB = ((float)votosNulosB / totalVotosCandidatoB) * 100;
		float percentualVotosValidosCandidatoB = ((float)votosValidosB / totalVotosCandidatoB) * 100;
		
		float percentualVotosBrancosCandidatoC = ((float)votosBrancosC / totalVotosCandidatoC) * 100;
		float percentualVotosNulosCandidatoC = ((float)votosNulosC / totalVotosCandidatoC) * 100;
		float percentualVotosValidosCandidatoC = ((float)votosValidosC / totalVotosCandidatoC) * 100;
		
		System.err.println("=============================================================");
		System.out.println("Candidato A");
		System.out.println("Total de votos = " + totalVotosCandidatoA);
		System.out.println("votos Validos = " + votosValidosA);
		System.out.println("votos Brancos = " + votosBrancosA);
		System.out.println("votos Nulos = " + votosNulosA);
		System.err.println("-------------------------------------------------------------");
		System.out.println("votos validos = " + percentualVotosValidosCandidatoA + "%");
		System.out.println("votos validos = " + percentualVotosBrancosCandidatoA + "%");
		System.out.println("votos validos = " + percentualVotosNulosCandidatoA + "%");
		System.err.println("=============================================================");
		
		System.err.println("=============================================================");
		System.out.println("Candidato B");
		System.out.println("Total de votos = " + totalVotosCandidatoB);
		System.out.println("votos Validos = " + votosValidosB);
		System.out.println("votos Brancos = " + votosBrancosB);
		System.out.println("votos Nulos = " + votosNulosB);
		System.err.println("-------------------------------------------------------------");
		System.out.println("votos validos = " + percentualVotosValidosCandidatoB + "%");
		System.out.println("votos validos = " + percentualVotosBrancosCandidatoB + "%");
		System.out.println("votos validos = " + percentualVotosNulosCandidatoB + "%");
		System.err.println("=============================================================");
		
		System.err.println("=============================================================");
		System.out.println("Candidato C");
		System.out.println("Total de votos = " + totalVotosCandidatoC);
		System.out.println("votos Validos = " + votosValidosC);
		System.out.println("votos Brancos = " + votosBrancosC);
		System.out.println("votos Nulos = " + votosNulosC);
		System.err.println("-------------------------------------------------------------");
		System.out.println("votos validos = " + percentualVotosValidosCandidatoC + "%");
		System.out.println("votos validos = " + percentualVotosBrancosCandidatoC + "%");
		System.out.println("votos validos = " + percentualVotosNulosCandidatoC + "%");
		System.err.println("=============================================================");
		
		
		sc.close();
	}

}
