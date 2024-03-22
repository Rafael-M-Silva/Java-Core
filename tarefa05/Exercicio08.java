package tarefa05;

import java.util.Scanner;

public class Exercicio08 {
	
	static void readHourStartAndFinishGameFromInput() {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas começou a partida de Xadrez?");
		int hourStart = sc.nextInt();
		
		System.out.println("Que horas acabou a partida de Xadrez?");
		int hourFinished = sc.nextInt();
		
		
		sc.close();
		
		calcTempGame(hourStart, hourFinished);
	} catch (Exception e) {
		System.err.println("Erro, Digite um valor valido!");
		readHourStartAndFinishGameFromInput();
	}
	}
	
	static void calcTempGame(int hourStart, int hourFinished) {
		int calc;
		if(hourFinished <= hourStart) {
			calc = (24 - hourStart) + hourFinished;
			System.out.println("A partida durou " + calc + "h");
			return;
		}
		calc = hourFinished - hourStart;
		
		System.out.println("A partida durou " + calc + "h");
	}

	public static void main(String[] args) {
		// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
		readHourStartAndFinishGameFromInput();
	
	}

}
