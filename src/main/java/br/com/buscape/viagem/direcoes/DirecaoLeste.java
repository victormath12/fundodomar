package br.com.buscape.viagem.direcoes;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoEnum;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;


public class DirecaoLeste implements Direcao{
	
	public DirecaoEnum nome() {
		return DirecaoEnum.LESTE;
	}
	
	public Direcao right() {
		return new DirecaoSul();
	}

	public Direcao left() {
		return new DirecaoNorte();
	}
	
}
