package aplicacao;

import xadrez.PartidaDeXadrez;

public class Progama {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.printBoard(partida.getPecas());
		
	}
}