/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada	Exemplo de Saída
576			576
			5 nota(s) de R$ 100,00
			1 nota(s) de R$ 50,00
			1 nota(s) de R$ 20,00
			0 nota(s) de R$ 10,00
			1 nota(s) de R$ 5,00
			0 nota(s) de R$ 2,00
			1 nota(s) de R$ 1,00

11257			11257
			112 nota(s) de R$ 100,00
			1 nota(s) de R$ 50,00
			0 nota(s) de R$ 20,00
			0 nota(s) de R$ 10,00
			1 nota(s) de R$ 5,00
			1 nota(s) de R$ 2,00
			0 nota(s) de R$ 1,00

503			503
			5 nota(s) de R$ 100,00
			0 nota(s) de R$ 50,00
			0 nota(s) de R$ 20,00
			0 nota(s) de R$ 10,00
			0 nota(s) de R$ 5,00
			1 nota(s) de R$ 2,00
			1 nota(s) de R$ 1,00
*/

import java.util.Scanner;

public class BeeCrowd1018{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int n, notasDe100 = 0, notasDe50 = 0, notasDe20 = 0, notasDe10 = 0, notasDe5 = 0, notasDe2 = 0, notasDe1 = 0, resto = 0;
		
		n = leia.nextInt();
		
		if(n > 0 && n < 1000000){
			notasDe100  = n / 100;
			resto = n % 100;
			notasDe50   = resto / 50;
			resto = resto % 50;
			notasDe20   = resto / 20;
			resto = resto % 20;
			notasDe10   = resto / 10;
			resto = resto % 10;
			notasDe5    = resto / 5;
			resto = resto % 5;
			notasDe2    = resto  / 2;
			notasDe1    = resto % 2;
			
			System.out.printf("%d nota(s) de R$ 100,00\n", notasDe100);
			System.out.printf("%d nota(s) de R$ 50,00\n", notasDe50);
			System.out.printf("%d nota(s) de R$ 20,00\n", notasDe20);
			System.out.printf("%d nota(s) de R$ 10,00\n", notasDe10);
			System.out.printf("%d nota(s) de R$ 5,00\n", notasDe5);
			System.out.printf("%d nota(s) de R$ 2,00\n", notasDe2);
			System.out.printf("%d nota(s) de R$ 1,00\n", notasDe1);
		}
	}
}





