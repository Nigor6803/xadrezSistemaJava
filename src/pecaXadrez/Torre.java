package pecaXadrez;

import tabuleiro.Board;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez{

	public Torre(Board board, Cor cor) {
		super(board, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}
