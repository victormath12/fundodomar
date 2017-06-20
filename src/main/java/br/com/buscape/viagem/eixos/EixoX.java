package br.com.buscape.viagem.eixos;

public class EixoX implements Eixo{

	
	private EixoEnum nome = EixoEnum.X;
	private int valor;
	
	
	//Construtor
	public EixoX(){}
	
	public EixoX(int x){
		this.valor = x;
	}
	

	public EixoEnum getNome() {
		return nome;
	}


	public int getValor() {
		return valor;		
	}

	
	public void setValor(int x) {
		this.valor = x;		
	}

	
	
}
