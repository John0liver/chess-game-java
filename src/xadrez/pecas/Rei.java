package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	

}
