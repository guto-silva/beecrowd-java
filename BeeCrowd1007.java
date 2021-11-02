/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada	Exemplos de Saída
5
6
7
8			DIFERENCA = -26

0
0
7
8			DIFERENCA = -56

5
6
-7
8			DIFERENCA = 86
*/

import java.util.Scanner;

public class BeeCrowd1007{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		D = leia.nextInt();
		
		DIFERENCA = (	A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
	}
}
