package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{

	private Cor color;

	public PecaXadrez(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro);
		this.color = color;
	}

	public Cor getColor() {
		return color;
	}
	
}
