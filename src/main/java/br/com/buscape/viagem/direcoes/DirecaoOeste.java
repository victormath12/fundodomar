package br.com.buscape.viagem.direcoes;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoEnum;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;


public class DirecaoOeste implements Direcao{
	
	public DirecaoEnum nome() {
		return DirecaoEnum.OESTE;
	}
	
	public Direcao right() {
		return new DirecaoNorte();
	}

	public Direcao left() {
		return new DirecaoSul();
	}
	
}
