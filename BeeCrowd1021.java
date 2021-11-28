/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada	Exemplo de Saída
576.73			NOTAS:
			5 nota(s) de R$ 100.00
			1 nota(s) de R$ 50.00
			1 nota(s) de R$ 20.00
			0 nota(s) de R$ 10.00
			1 nota(s) de R$ 5.00
			0 nota(s) de R$ 2.00
			MOEDAS:		
			1 moeda(s) de R$ 1.00
			1 moeda(s) de R$ 0.50
			0 moeda(s) de R$ 0.25
			2 moeda(s) de R$ 0.10
			0 moeda(s) de R$ 0.05
			3 moeda(s) de R$ 0.01

4.00			NOTAS:
			0 nota(s) de R$ 100.00
			0 nota(s) de R$ 50.00
			0 nota(s) de R$ 20.00
			0 nota(s) de R$ 10.00
			0 nota(s) de R$ 5.00
			2 nota(s) de R$ 2.00
			MOEDAS:
			0 moeda(s) de R$ 1.00
			0 moeda(s) de R$ 0.50
			0 moeda(s) de R$ 0.25
			0 moeda(s) de R$ 0.10
			0 moeda(s) de R$ 0.05
			0 moeda(s) de R$ 0.01

91.01			NOTAS:
			0 nota(s) de R$ 100.00
			1 nota(s) de R$ 50.00
			2 nota(s) de R$ 20.00
			0 nota(s) de R$ 10.00
			0 nota(s) de R$ 5.00
			0 nota(s) de R$ 2.00
			MOEDAS:
			1 moeda(s) de R$ 1.00
			0 moeda(s) de R$ 0.50
			0 moeda(s) de R$ 0.25
			0 moeda(s) de R$ 0.10
			0 moeda(s) de R$ 0.05
			1 moeda(s) de R$ 0.01
*/

import java.util.Scanner;

public class BeeCrowd1021{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
		int moeda1 = 0, moeda050 = 0, moeda025 = 0, moeda010 = 0, moeda005 = 0, moeda001 = 0;
		float resto = 0;
		
		float n = leia.nextFloat();
		
		nota100 = (int) n / 100;
		resto   = n % 100f;
		nota50  = (int)resto / 50;
		resto   = resto % 50f;
		nota20  = (int) resto  / 20;
		resto   = resto % 20f;
		nota10  = (int) resto  / 10;
		resto   = resto % 10f; 
		nota5   = (int) resto / 5;
		resto   = resto % 5f;
		nota2   = (int) resto / 2;
		resto   = resto % 2f;

		moeda1  = (int)Math.floor(resto / 1);
		resto   = resto % 1f;
		moeda050 = (int)Math.floor(resto / 0.5);
		resto = resto % 0.5f;
		moeda025 = (int)Math.floor(resto / 0.25);
		resto = resto % 0.25f;
		moeda010 = (int)Math.floor(resto / 0.10);
		resto = resto % 0.10f;
		moeda005 = (int)Math.floor(resto / 0.05);
		resto = resto % 0.05f;
		moeda001 = (int)Math.round(resto / 0.01);
		
		
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
		System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
		System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
		System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
		System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
		System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", moeda050);
		System.out.printf("%d moeda(s) de R$ 0.25\n", moeda025);
		System.out.printf("%d moeda(s) de R$ 0.10\n", moeda010);
		System.out.printf("%d moeda(s) de R$ 0.05\n", moeda005);
		System.out.printf("%d moeda(s) de R$ 0.01\n", moeda001);
		
		leia.close();
	}
}
