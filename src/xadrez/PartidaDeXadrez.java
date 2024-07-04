package xadrez;

import pecaXadrez.Rei;
import pecaXadrez.Torre;
import tabuleiro.Board;

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
	
	private void novoLocalDePeca(char coluna, int linha, PecaDeXadrez peca) {
		board.lugarDaPeca(peca,new XadrezPosicao(coluna, linha).ToPosicao());
	}
	
	public void setupInicial() {
		novoLocalDePeca('b',6,new Torre(board, Cor.BRANCO));
		novoLocalDePeca('e',8,new Rei(board, Cor.PRETO));
		novoLocalDePeca('e',1,new Rei(board, Cor.BRANCO));
	}
}
