package jogoDaVelha;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] jogoDaVelha = new char[3][3];
		boolean encerrarJogo = false, colunaValida = false, linhaValida = false;
		int rodada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		int i = 0, j = 0;

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

			System.out.println("Informe sua jogada: ");

			while (!linhaValida) {
				System.out.println("Linha: ");
				linha = sc.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada Inválida, informe (1, 2 ou 3)");
				}
			}

			while (!colunaValida) {
				System.out.println("Coluna: ");
				coluna = sc.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada Inválida, informe (1, 2 ou 3)");
				}
			}
			System.out.println();

			linha--;
			coluna--;
			
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Esta posição já foi usada, tente novamente.");
			} else {
				jogoDaVelha[linha][coluna] = sinal;
				rodada ++;
			}

			for (i = 0; i < jogoDaVelha.length; i++) {
				for (j = 0; j < jogoDaVelha[i].length; j++) {
						System.out.print(jogoDaVelha[i][j]);
						if (j < jogoDaVelha[i].length - 1) {
							System.out.print(" | ");
						}
				}
				System.out.println();
			}
		}

		sc.close();
	}

}
