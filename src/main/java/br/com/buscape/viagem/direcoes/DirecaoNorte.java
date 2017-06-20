package br.com.buscape.viagem.direcoes;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoEnum;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;


public class DirecaoNorte implements Direcao{
	
	public DirecaoEnum nome() {
		return DirecaoEnum.NORTE;
	}
	
	public Direcao right() {
		return new DirecaoLeste();
	}

	public Direcao left() {
		return new DirecaoOeste();
	}
	
}
