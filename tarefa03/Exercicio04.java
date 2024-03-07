package tarefa03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
         // O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor 
         // e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% 
         // e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
         
        
        Scanner sc = new Scanner(System.in);
        
        float custoFabrica, custoFinal, custoComImposto;
        
        float porcentagemDistribuidor = 0.28f, impostos = 0.45f;
        
        System.out.println("Qual o valor do carro - custo de fabrica? ");
        custoFabrica = sc.nextFloat();
 
        custoComImposto = (impostos * custoFabrica) + custoFabrica;
        
        custoFinal = (porcentagemDistribuidor * custoComImposto) + custoComImposto;
        
        System.out.println(custoFinal);
        
        sc.close();

    }

}
