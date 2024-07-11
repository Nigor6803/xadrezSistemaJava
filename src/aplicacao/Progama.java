package aplicacao;

import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.XadrezPosicao;

public class Progama {

	public static void main(String[] args) {
		
		Scanner edd = new Scanner(System.in);
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		
		while (true) {
					
		UI.printBoard(partida.getPecas());
		System.out.println();
		System.out.print("ORIGEM:" );
		XadrezPosicao origem = UI.lerXadrezPosicao(edd);
		
		System.out.println();
		System.out.print("DESTINO:" );
		XadrezPosicao destino = UI.lerXadrezPosicao(edd);
		
		PecaDeXadrez capturaPeca = partida.perfomanceXadrezMovimento(origem,destino);
		}
	}
}