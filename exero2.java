package br.com.generation.Atividades3;

import java.util.Scanner;

public class exero2 {
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
       que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
       imprima a média aritmética dos lançamentos, contabilize e apresente também
       quantas foram as ocorrências da maior pontuação.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	     int[] vetor = new int[10];
	        int maior = 0, i;
	        double media= 0.0, soma = 0.0;

	        for(i = 0; i < 10; i++) {
	            System.out.println("Qual o valor do " + (i+1) + "º Arremesso do Dado: ");
	            vetor[i] = leia.nextInt(7);
	            soma = soma + vetor[i];
	            media = soma / 10;
	            
	            if(vetor[i] > maior) {
	                maior = vetor[i];
	               
	            }
	     
	        }
	        System.out.println("A soma é " + soma);
            System.out.println("A média dos valores são: " + media);
            System.out.print("O maior valores são: " + maior);
	            
	  leia.close();
	     
	    }


}
