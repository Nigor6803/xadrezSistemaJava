package tabuleiro;

public class Board {
	
	private Integer linha;
	private Integer coluna;
	private Peca[][]pecas;
	
	public Board() {
		}
	
	public Board(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}
	
	public Integer getLinha() {
		return linha;
	}
	
	public void setLinha(Integer linha) {
		this.linha = linha;
	}
	
	public Integer getColuna() {
		return coluna;
	}
	
	public void setColuna(Integer coluna) {
		this.coluna = coluna;
	}
	
	public Peca peca(Integer linha, Integer coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarDaPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
