package br.com.buscape.viagem.controlador;
import br.com.buscape.viagem.Submarino;

public class ControleDeBordo {


   public String executarComandos(Submarino submarino, String comandos){
	   
	   for(char comando : comandos.toCharArray()){
		   
		   if (comando == Comandos.UP)
			   submarino.subir();
		   
		   if (comando == Comandos.DOWN)
			   submarino.descer();
		   
		   if (comando == Comandos.LEFT)
			   submarino.girar(Comandos.LEFT);
		   
		   if (comando == Comandos.RIGHT)
			   submarino.girar(Comandos.RIGHT);
		   
		   if (comando == Comandos.MOVE)
			   submarino.mover();		   
		   
	   }

    return submarino.printPosicao();
	   
   }

	
}
