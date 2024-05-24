package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String answer = scanner.next();
    if (!NumberUtils.isCreatable(answer)) {
      System.out.println("Número da conta inválido!");
      return;
    }
    AccountNumberFormatter formatter = new AccountNumberFormatter();
    String account = formatter.formatAccountNumber(Integer.parseInt(answer));
    System.out.print("Número da conta: " + account);
  }

}
