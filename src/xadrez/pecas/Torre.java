package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return "T";
	}

	
	
}
