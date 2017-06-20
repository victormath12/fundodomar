package br.com.buscape.viagem.eixos;

public class EixoZ implements Eixo{

	
	public final EixoEnum nome = EixoEnum.Z;
	private int valor;
	
	
	//Construtor
	public EixoZ(int z){
		this.valor = z;
	}
	
	
	public EixoEnum getNome() {
		return nome;
	}
	

	public int getValor() {
		return valor;		
	}
	
		
	//Setar Valor para o Eixo Z
	public void setValor(int z) {
		this.valor = z;		
	}

	
	
}
