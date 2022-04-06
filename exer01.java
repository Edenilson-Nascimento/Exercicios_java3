package br.com.generation.Atividades3;

import java.util.Scanner;

public class exer01 {
	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
       atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor = new int[5];
		int maior = 0; 
	
		System.out.println("Digite as 5 pontuações da atividades: ");
		for(int i = 0; i < 5; i++) {
			System.out.println("Posição: " + (i+1) + "° ");
			vetor[i] = entrada.nextInt();
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		
		}
		System.out.println("O maior valor é " + maior);
		
		entrada.close();

	}

}
