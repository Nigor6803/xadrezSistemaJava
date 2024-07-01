package pecaXadrez;

import tabuleiro.Board;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez{

	public Rei(Board board, Cor cor) {
		super(board, cor);
		}
	
	@Override
	public String toString() {
		return "K";
	}

}
