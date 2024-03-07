package tarefa03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
		// utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
		//(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da
        //distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade
		//média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos efetuar o calculo da quantidade de litros de combustível gasta em uma viagem");
		System.out.println("Qual o tempo gasto da viagem?");
		float tempoGasto = sc.nextFloat();
		
		System.out.println("Qual a velocidade media?");
		int velocidadeMedia = sc.nextInt();
		
		float distanciaPercorrida = tempoGasto * velocidadeMedia;
		
		int litrosUsados = (int) (distanciaPercorrida / 12);
		
		System.out.println("Velocidade media: " + velocidadeMedia + "Km/h");
		System.out.println("Tempo gasto na viagem: " + tempoGasto + "h");
		System.out.println("Distancia percorrida: " + distanciaPercorrida + "Km");
		System.out.println("Quantidade de litros utilizado na viagem: " + litrosUsados + " Litros");
		
		
		sc.close();
	}
}
