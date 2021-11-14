/*
João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.
	1 2 3 4 5 6 7 8 9 0
Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤ 10^100) correspondente ao valor que João quer montar com os leds.

Saída
Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o valor desejado, seguido da palavra "leds".

Exemplo de Entrada	Exemplo de Saída
3
115380			27 leds
2819311		29 leds
23456			25 leds
*/

import java.util.Scanner;

public class Beecrowd1168{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		final int led1 = 2, led2 = 5, led3 = 5, led4 = 4, led5 = 5, led6 = 6, led7 = 3, led8 = 7, led9 = 6, led0 = 6;
		
		int n = leia.nextInt(), quantidadeLed = 0;
		
		String[] v = new String[n];		
		
		for(int i = 0; i < n; i++){
			v[i] = leia.next();
			for(int x = 0; x < v[i].length(); x++){
				if(v[i].charAt(x) == '1'){
					quantidadeLed += led1;
				}
				if(v[i].charAt(x) == '2'){
					quantidadeLed += led2;
				}
				if(v[i].charAt(x) == '3'){
					quantidadeLed += led3;
				}
				if(v[i].charAt(x) == '4'){
					quantidadeLed += led4;
				}
				if(v[i].charAt(x) == '5'){
					quantidadeLed += led5;
				}
				if(v[i].charAt(x) == '6'){
					quantidadeLed += led6;
				}
				if(v[i].charAt(x) == '7'){
					quantidadeLed += led7;
				}
				if(v[i].charAt(x) == '8'){
					quantidadeLed += led8;
				}
				if(v[i].charAt(x) == '9'){
					quantidadeLed += led9;
				}
				if(v[i].charAt(x) == '0'){
					quantidadeLed += led0;
				}
			}
			System.out.println(quantidadeLed + " leds");
			quantidadeLed = 0;
		}
		
	}
}
