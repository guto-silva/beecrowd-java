/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
Exemplo de Entrada	Exemplo de Saída
556			0:9:16
1			0:0:1
140153			38:55:53
*/

import java.util.Scanner;

public class BeeCrowd1019{
	public static void main(String args[]){
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		
		int horas = 0, minutos = 0, segundos = 0;
		
		horas = n / 3600;
		minutos = (n % 3600) / 60;		
		segundos = n % 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}
}
