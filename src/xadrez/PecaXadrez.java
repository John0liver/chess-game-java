package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca{

	private Cor color;

	public PecaXadrez(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro);
		this.color = color;
	}

	public Cor getColor() {
		return color;
	}
	
	protected boolean existePecaOponente(Posicao posicao) {
		PecaXadrez p = (PecaXadrez) getTabuleiro().peca(posicao);
		return p != null && p.getColor() != color;
	}
	
}
