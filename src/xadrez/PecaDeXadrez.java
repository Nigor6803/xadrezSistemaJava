package xadrez;

import tabuleiro.Board;
import tabuleiro.Peca;

public class PecaDeXadrez extends Peca {

	private Cor cor;

	public PecaDeXadrez(Board board, Cor cor) {
		super(board);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
