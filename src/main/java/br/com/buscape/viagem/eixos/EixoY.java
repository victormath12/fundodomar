package br.com.buscape.viagem.eixos;

public class EixoY implements Eixo{

	
	public final EixoEnum nome = EixoEnum.Y;
	private int valor;
	
	
	//Construtor
	public EixoY(){}
	public EixoY(int y){
		this.valor = y;
	}
	
	
	public EixoEnum getNome() {
		return nome;
	}
	

	public int getValor() {
		return valor;		
	}

	
	public void setValor(int y) {
		this.valor = y;		
	}

	
	
}
