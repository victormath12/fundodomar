package br.com.buscape.viagem.direcoes;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoEnum;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;


public class DirecaoSul implements Direcao{
	
	public DirecaoEnum nome() {
		return DirecaoEnum.SUL;
	}
	
	public Direcao right() {
		return new DirecaoOeste();
	}

	public Direcao left() {
		return new DirecaoLeste();
	}
	
}
