package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	

}
