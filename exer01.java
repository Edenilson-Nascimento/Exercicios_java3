package br.com.generation.Atividades3;

import java.util.Scanner;

public class exer01 {
	/*
	 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
       atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor = new int[5];
		int maior = 0; 
	
		System.out.println("Digite as 5 pontua��es da atividades: ");
		for(int i = 0; i < 5; i++) {
			System.out.println("Posi��o: " + (i+1) + "� ");
			vetor[i] = entrada.nextInt();
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		
		}
		System.out.println("O maior valor � " + maior);
		
		entrada.close();

	}

}
