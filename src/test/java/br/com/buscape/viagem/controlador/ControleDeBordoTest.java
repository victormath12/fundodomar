package br.com.buscape.viagem.controlador;
import br.com.buscape.viagem.Submarino;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author victorsax12@gmail.com
 */
public class ControleDeBordoTest {
 
 @Before
 public void setUp() {
  System.out.println("INIT UNIT TEST: ControleDeBordoTest");
 }
 
 @After
 public void tearDown() {
  System.out.println("END OF UNIT TEST");
 }

 @Test
 public void testExecutarComandos() {
  
  //TEST 001 = 
  Submarino submarino = new Submarino();
  String comandos = "LMRDDMMUU";
  ControleDeBordo instance = new ControleDeBordo();
  String result = instance.executarComandos(submarino, comandos);
  assertEquals("-1 2 0 NORTE", result);  
  
  
  //TEST 002 = 
  submarino = new Submarino();
  comandos = "RMMLMMMDDLL";
  instance = new ControleDeBordo();
  result = instance.executarComandos(submarino, comandos);
  assertEquals("2 3 -2 SUL", result);  
  
 }
 
}
