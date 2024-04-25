package tarefa13;

import java.util.Arrays;

public class Exercicio06 {

	static void maxNum(int num1, int num2) {
		int[] nums = new int[2];
		nums[0] = num1;
		nums[1] = num2;
		
		Arrays.sort(nums);
		
		int bigNum = nums[nums.length - 1];
		
		System.out.println("O maior numero entre " + num1 + " e " + num2 + " e " + bigNum);
		
	}
	public static void main(String[] args) {
		// Calcular o máximo entre dois números: Implemente uma função que receba dois números como parâmetros e retorne o maior deles.

		int num1 = 12;
		int num2 = 25;
		
		maxNum(num1, num2);
	}

}
