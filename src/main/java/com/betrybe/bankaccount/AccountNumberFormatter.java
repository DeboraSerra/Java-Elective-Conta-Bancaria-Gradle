package com.betrybe.bankaccount;


/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String numberToString = Integer.toString((literalAccountNumber));
    if (numberToString.length() == 6) return  numberToString;
    if (numberToString.length() > 6) {
      int start = numberToString.length() - 6;
      String newAccount = numberToString.substring(start);
      return  newAccount;
    }
    int leadingZeros = 6 - numberToString.length();
    String start = "";
    for (int i = 1; i <= leadingZeros; i +=1 ) {
      start += "0";
    }
    return start + numberToString;
  }

}
