package xadrez;

import tabuleiro.Board;

public class PartidaDeXadrez{
		
	private Board board;
	
	public PartidaDeXadrez() {
		board = new Board(8,8);
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[board.getLinha()][board.getColuna()];
		for (int i = 0;i<board.getLinha();i++) {
			for (int j = 0;j<board.getColuna();j++) {
				mat[i][j]= (PecaDeXadrez) board.peca(i,j);
			}
		}
		return mat;
	}
}
