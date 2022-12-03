package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcecaoTabuleiro("Erro ao criar tabuleiro: � necess�rio que contenha pelo menos 1 linha e 1 coluna.");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linhas, int colunas) {
		if (!existePosicao(linhas, colunas)) {
			throw new ExcecaoTabuleiro("Posi��o fora do tabuleiro.");
		}
		return pecas[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcecaoTabuleiro("Posi��o fora do tabuleiro.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (existePeca(posicao)) {
			throw new ExcecaoTabuleiro("J� existe uma pe�a nesta posi��o " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean existePeca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExcecaoTabuleiro("Posi��o fora do tabuleiro. ");
		}
		return peca(posicao) != null;
	}
	
}
