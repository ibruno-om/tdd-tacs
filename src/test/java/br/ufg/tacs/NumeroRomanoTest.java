package br.ufg.tacs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public class NumeroRomanoTest {

  @Test
  public void validarConversao400() {
    assertEquals(NumeroRomano.converter("CD"), 400);
  }

}
