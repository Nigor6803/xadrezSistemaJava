package tabuleiro;

public class Board {

	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;

	public Board() {
	}

	public Board(Integer linha, Integer coluna) {
		if (linha < 1 || coluna < 1) {
			throw new ExceçãoTabuleiro("Erro: Deve haver pelo menos 1 linha e 1 coluna");
		}

		this.linhas = linha;
		this.colunas = coluna;
		pecas = new Peca[linha][coluna];
	}

	public Integer getLinha() {
		return linhas;
	}

	public Integer getColuna() {
		return colunas;
	}

	public Peca peca(Integer linha, Integer coluna) {
		if (!posicaoexistente(linha,coluna)) {
			throw new ExceçãoTabuleiro("POSIÇÃO INCORRETA");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!posicaoexistente(posicao)) {
			throw new ExceçãoTabuleiro("POSIÇÃO INCORRETA");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void lugarDaPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao)) {
			throw new ExceçãoTabuleiro("Já existe uma peça em posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean posicaoexistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoexistente(Posicao posicao) {
		return posicaoexistente(posicao.getLinha(), posicao.getColuna());
	}

	public boolean temUmaPeca(Posicao posicao) {
		if (!posicaoexistente(posicao)) {
			throw new ExceçãoTabuleiro("POSIÇÃO INCORRETA");
		}
		return peca(posicao) != null;
	}
}
