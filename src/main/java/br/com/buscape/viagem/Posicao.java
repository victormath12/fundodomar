package br.com.buscape.viagem;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;
import br.com.buscape.viagem.eixos.EixoZ;

public class Posicao {

	private Eixo x;
	private Eixo y;
	private Eixo z;
	
	
	public Posicao(){
		this.x = new EixoX(0);
		this.y = new EixoY(0);
		this.z = new EixoZ(0);
	}

	
	public Eixo getX() {
		return x;
	}
	public void setX(Eixo x) {
		this.x = x;
	}
	public Eixo getY() {
		return y;
	}
	public void setY(Eixo y) {
		this.y = y;
	}
	public Eixo getZ() {
		return z;
	}
	public void setZ(Eixo z) {
		this.z = z;
	}
	
	
	
}
