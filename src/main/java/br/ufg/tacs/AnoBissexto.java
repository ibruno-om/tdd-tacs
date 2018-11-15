package br.ufg.tacs;

/**
 * Valida o ano bissexto.
 *
 * @author Iago Bruno
 * @since 1.0
 */
public class AnoBissexto {


  /**
   * Valida se um ano é bissexto
   *
   * @param ano valor válido de ano
   * @return true caso o ano seja bissexto, caso contrário, false.
   */
  public static boolean isAnoBissexto(int ano) {
    if (ano % 4 == 0) {
      if (ano % 100 == 0) {
        return (ano % 400 == 0);
      } else {
        return true;
      }
    } else {
      return (ano % 100 == 0 && ano % 400 == 0);
    }
  }
}
