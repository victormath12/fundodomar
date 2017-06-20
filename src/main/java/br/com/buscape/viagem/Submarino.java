package br.com.buscape.viagem;
import br.com.buscape.viagem.controlador.Comandos;
import br.com.buscape.viagem.direcoes.Direcao;
import br.com.buscape.viagem.direcoes.DirecaoEnum;
import br.com.buscape.viagem.direcoes.DirecaoNorte;
import br.com.buscape.viagem.eixos.Eixo;
import br.com.buscape.viagem.eixos.EixoEnum;
import br.com.buscape.viagem.eixos.EixoX;
import br.com.buscape.viagem.eixos.EixoY;
import br.com.buscape.viagem.eixos.EixoZ;

public class Submarino {

	
	//Atributos
	Posicao posicao;
	Direcao direcao;
	
	
	public Submarino(){
		this.posicao = new Posicao();
		this.direcao = new DirecaoNorte();
	}
	
	
	public void subir(){
		if(this.posicao.getZ().getValor() != 0)
			this.posicao.getZ().setValor(posicao.getZ().getValor() + 1);
		else
			System.out.println("O Submarino j� est� na Superf�cie...");
	}
	
	
	public void descer(){
		this.posicao.getZ().setValor(posicao.getZ().getValor() - 1);		
	}
	

	public void girar(char comando){
		
		if(comando == Comandos.RIGHT)
			this.direcao = direcao.right();
		
		else if(comando == Comandos.LEFT)
			this.direcao = direcao.left();	
	}

	
	public void mover(){
		
		if(this.direcao.nome() == DirecaoEnum.NORTE)
			this.posicao.getY().setValor(posicao.getY().getValor() + 1);
		
		else if(this.direcao.nome() == DirecaoEnum.LESTE)
			this.posicao.getX().setValor(posicao.getX().getValor() + 1);
		
		else if(this.direcao.nome() == DirecaoEnum.SUL)
			this.posicao.getY().setValor(posicao.getY().getValor() - 1);
		
		else if(this.direcao.nome() == DirecaoEnum.OESTE)
			this.posicao.getX().setValor(posicao.getX().getValor() - 1);
	}
	
	
	
	public String printPosicao(){
		
		return this.posicao.getX().getValor() + " " +
			   this.posicao.getY().getValor() + " " +
			   this.posicao.getZ().getValor() + " " +
			   this.direcao.nome();
		
	}
	
	
}
