package br.com.buscape.viagem;

import br.com.buscape.viagem.controlador.ControleDeBordo;

public class ViagemApp {

	
	public static void main(String[] args) {

		//Criar um Submarino e deixa o Controlador de Bordo trabalhar!!!
		Submarino submarino = new Submarino();		
		ControleDeBordo controlador = new ControleDeBordo();	
		String comando = "RMMLMMMDDLL";
		String result = controlador.executarComandos(submarino,comando);
  System.out.println(result);

	}


}
