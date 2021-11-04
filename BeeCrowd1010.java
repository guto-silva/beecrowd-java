/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

Exemplos de Entrada	Exemplos de Saída
12 1 5.30
16 2 5.10		VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20		VALOR A PAGAR: R$ 51.40

1 1 15.10
2 1 15.10		VALOR A PAGAR: R$ 30.20
*/

import java.util.Scanner;

public class BeeCrowd1010{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int codigoDaPeca[] = new int[2], numeroDePecas[] = new int[2];
		double valorUnitario[] = new double[2], valorTotal=0;
		
		for(int i = 0; i < 2; i++){
			codigoDaPeca[i] = leia.nextInt();
			numeroDePecas[i] = leia.nextInt();
			valorUnitario[i] = leia.nextDouble();
			valorTotal += valorUnitario[i] * numeroDePecas[i]; 
		} 	
					
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	}
}
