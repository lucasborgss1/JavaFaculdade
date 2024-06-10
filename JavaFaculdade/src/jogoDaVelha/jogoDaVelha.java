package jogoDaVelha;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] jogoDaVelha = new char[3][3];
		boolean encerrarJogo = false;
		int rodada = 1;
		char sinal;
		
		System.out.println("Vamos começar o jogo!");
		System.out.println("Jogador 1 = (X)");
		System.out.println("Jogador 2 = (O)");
		
		while (!encerrarJogo) {
			System.out.println("Rodada " + rodada);
			if (rodada % 2 == 1) {
				System.out.println("É a vez do jogador 1.");
				sinal = 'X';
			} else {
				System.out.println("É a vez do jogador 2.");
				sinal = 'O';
			}
		}
		
		sc.close();
	}

}
