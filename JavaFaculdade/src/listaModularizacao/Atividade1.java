//1) Escrva um programa para fazer uma calculadora com as quatro 
//operações fundamentais (+, -, *, /).

package listaModularizacao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a operação: (+, -, *, /)?");
		char operacao = sc.next().charAt(0);
		System.out.println("Informe o primeiro número:");
		double num1 = sc.nextDouble();
		System.out.println("Informe o segundo número:");
		double num2 = sc.nextDouble();
		double resposta;
		sc.close();

		switch (operacao) {
		case '+':
			resposta = soma(num1, num2);
			System.out.println("A soma = " + resposta);
			break;
		case '-':
			resposta = subtracao(num1, num2);
			System.out.println("A subtracao = " + resposta);
			break;
		case '*':
			resposta = multiplicacao(num1, num2);
			System.out.println("A Multiplicacao = " + resposta);
			break;
		case '/':
			resposta = divisao(num1, num2);
			System.out.println("A divisao = " + resposta);
			break;

		}

	}

	public static double soma(double a, double b) {
		double resposta;
		resposta = a + b;
		return resposta;
	}

	public static double subtracao(double a, double b) {
		double resposta;
		resposta = a - b;
		return resposta;
	}

	public static double multiplicacao(double a, double b) {
		double resposta;
		resposta = a * b;
		return resposta;
	}

	public static double divisao(double a, double b) {
		double resposta;
		resposta = a / b;
		return resposta;
	}

}
