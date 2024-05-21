//Escreva um programa que leia um vetor com 8 elementos, e imprima a multiplicação
//dos elementos lidos.


package listaVetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[8];
		int multiplicacao = 1;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {

			multiplicacao = array[i] * multiplicacao;
		}
		
		System.out.println("O resultado da multiplicação dos valores no vetor é: " + multiplicacao);
		
		sc.close();
	}

}
