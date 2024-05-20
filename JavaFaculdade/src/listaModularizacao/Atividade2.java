//2) Escreva um programa que leia o nome, sexo, altura e peso de um 
//grupo de pessoas e informe:
//  a) Média das alturas dos homens e dos pesos das mulheres.
//  b) Nome do homem mais pesado e da mulher mais alta.
//obs: No final de cada nova entrada da pesquisa deve ser perguntado
//se a pesquisa irá continuar.


package listaModularizacao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, nomeMaisAlta = "", nomeMaisPesado = "";
		char sexo, continuar;
		float altura, peso, alturaTotal = 0, pesoTotal = 0, maisAlta = 0, maisPesado = 0, mediaHomens, mediaMulheres;
		int totalMulheres = 0, totalHomens = 0;
	
		
		do {
			System.out.println("Informe o nome: ");
			nome = sc.next();
			
			System.out.println("Informe o sexo: (M)asculino ou (F)eminino: ");
			sexo = sc.next().charAt(0);

			while (sexo != 'M' || sexo != 'm' || sexo != 'f' || sexo != 'F') {
				System.out.println(" - Caractere inválido!");
				
				System.out.println("Informe o sexo: (M)asculino ou (F)eminino: ");
				sexo = sc.next().charAt(0);
				if (sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F') {
					break;
				}

			}
			
			System.out.println("Informe a altura: ");
			altura = sc.nextFloat();
			
			System.out.println("Informe o peso: ");
			peso = sc.nextFloat();
			
			System.out.println("Deseja continuar? (S)im ou (N)ão: ");
			continuar = sc.next().charAt(0);
			

			if (sexo == 'M' || sexo == 'm') {
				totalHomens ++;
				pesoTotal += peso;
				if (maisPesado < peso) {
					maisPesado = peso;
					nomeMaisPesado = nome;
				}
			} else if (sexo == 'f' || sexo == 'F') {
				totalMulheres ++;
				alturaTotal += altura;
				if (maisAlta < altura) {
					maisAlta = altura;
					nomeMaisAlta = nome;
				}
			}
		
		} while (continuar == 's' || continuar == 'S');
		
		mediaHomens = mediaPesoHomens(totalHomens, pesoTotal);
		mediaMulheres = mediaAlturaMulheres(totalMulheres, alturaTotal);
		medias(mediaHomens, mediaMulheres);
		nomes(nomeMaisPesado, nomeMaisAlta);
		
		sc.close();
	}
	
	
	public static float mediaPesoHomens(float a, float b) {
		return b / a;
	}
		
	public static float mediaAlturaMulheres(float a, float b) {
		return b / a;
	}
	
	public static void medias(float a, float b) {
		System.out.println("A média do peso dos homens é: " + a );
		System.out.println("A média da altura das mulheres é: " + b);
	}
	
	public static void nomes(String a, String b) {
		System.out.println("O nome do homem mais pesado é: " + a);
		System.out.println("O nome da mulher mais alta é: " + b);
	}
}


