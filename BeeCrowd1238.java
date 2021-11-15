/*
Implemente um programa denominado combinador, que recebe duas strings e deve combiná-las, alternando as letras de cada string, começando com a primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string, e assim sucessivamente. As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.

Exemplo de Entrada	Exemplo de Saída
2
Tpo oCder		TopCoder
aa bb			abab
*/

import java.util.Scanner;

public class BeeCrowd1238{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		
		for(int i = 0; i < n; i++){
			String word1, word2;
			word1 = leia.next();
			word2 = leia.next();
			
			char[] test1 = word1.toCharArray();
			char[] test2 = word2.toCharArray();
			int x = word1.length() + word2.length();
			String result = "";
			
			for(int j = 0; j < x; j++){
				if(j < word1.length()){
					result += test1[j];
				}
				if(j < word2.length()){
					result += test2[j];
				}
			}
			
			System.out.println(result);
			
		}
		
		leia.close();	
		
		
	}
}
