package br.com.generation.Atividades3;

import java.util.Scanner;

public class exero2 {
	/*
	 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
       que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
       imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
       quantas foram as ocorr�ncias da maior pontua��o.
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	     int[] vetor = new int[10];
	        int maior = 0, i;
	        double media= 0.0, soma = 0.0;

	        for(i = 0; i < 10; i++) {
	            System.out.println("Qual o valor do " + (i+1) + "� Arremesso do Dado: ");
	            vetor[i] = leia.nextInt(7);
	            soma = soma + vetor[i];
	            media = soma / 10;
	            
	            if(vetor[i] > maior) {
	                maior = vetor[i];
	               
	            }
	     
	        }
	        System.out.println("A soma � " + soma);
            System.out.println("A m�dia dos valores s�o: " + media);
            System.out.print("O maior valores s�o: " + maior);
	            
	  leia.close();
	     
	    }


}
