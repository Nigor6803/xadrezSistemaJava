package xadrez;



import pecaXadrez.Rei;
import pecaXadrez.Torre;
import tabuleiro.Board;
import tabuleiro.Peca;
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
	
	public PecaDeXadrez perfomanceXadrezMovimento(XadrezPosicao origemPosicao, XadrezPosicao destinoPosicao) {
		Posicao origem = origemPosicao.ToPosicao();
		Posicao destino = destinoPosicao.ToPosicao();
		validarOrigemposicao(origem);
		
		Peca capturaPeca = fazerMovimento(origem, destino);
		return (PecaDeXadrez)capturaPeca;
	}
	
	private Peca fazerMovimento(Posicao origem, Posicao destino) {
		Peca p = board.removerPeca(origem);
		Peca capturaPeca = board.removerPeca(destino);
		board.lugarDaPeca(p, destino);
		return capturaPeca;
	}
	
	private void validarOrigemposicao(Posicao posicao) {
		if(!board.temUmaPeca(posicao)) {
			throw new ExcecaoXadrez("NÃO HA PEÇA AQUI.");
		}
	}
	
	private void novoLocalDePeca(char coluna, int linha, PecaDeXadrez peca) {
		board.lugarDaPeca(peca,new XadrezPosicao(coluna, linha).ToPosicao());
	}
	
	public void setupInicial() {
				
		novoLocalDePeca('c', 1, new Torre(board, Cor.BRANCO));
		novoLocalDePeca('c', 2, new Torre(board, Cor.BRANCO));
		novoLocalDePeca('d', 2, new Torre(board, Cor.BRANCO));
		novoLocalDePeca('e', 2, new Torre(board, Cor.BRANCO));
		novoLocalDePeca('e', 1, new Torre(board, Cor.BRANCO));
		novoLocalDePeca('d', 1, new Rei(board, Cor.BRANCO));

		novoLocalDePeca('c', 7, new Torre(board, Cor.PRETO));
		novoLocalDePeca('c', 8, new Torre(board, Cor.PRETO));
		novoLocalDePeca('d', 7, new Torre(board, Cor.PRETO));
		novoLocalDePeca('e', 7, new Torre(board, Cor.PRETO));
		novoLocalDePeca('e', 8, new Torre(board, Cor.PRETO));
		novoLocalDePeca('d', 8, new Rei(board, Cor.PRETO));
        
        
	}
}
