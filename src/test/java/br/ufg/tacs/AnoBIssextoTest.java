package br.ufg.tacs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Verifica os métodos da classe {@link AnoBissexto}
 *
 * @author Iago Bruno
 * @since 1.0
 */
public class AnoBIssextoTest {

  @Test
  public void testaAnoBissextoVallido4(){
   assertTrue(AnoBissexto.isAnoBissexto(1704));
  }

  @Test
  public void testaAnoBissextoInvalido100(){
   assertFalse(AnoBissexto.isAnoBissexto(1700));
  }

  @Test
  public void testaAnoBissextoValido400(){
   assertTrue(AnoBissexto.isAnoBissexto(2000));
  }

}
