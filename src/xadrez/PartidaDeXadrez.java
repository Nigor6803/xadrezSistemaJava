package xadrez;

import pecaXadrez.Rei;
import pecaXadrez.Torre;
import tabuleiro.Board;
import tabuleiro.Posicao;

public class PartidaDeXadrez{
		
	private Board board;
	
	public PartidaDeXadrez() {
		board = new Board(8,8);
		setupInicial();
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
	
	public void setupInicial() {
		board.lugarDaPeca(new Torre(board, Cor.BRANCO), new Posicao(2,1));
		board.lugarDaPeca(new Rei(board, Cor.PRETO), new Posicao(0,4));
		board.lugarDaPeca(new Rei(board, Cor.BRANCO), new Posicao(7,4));
	}
}
