package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int sumAnos = anos * 365;
    int sumMesesAndDays = (meses * 30) + dias;

    return sumAnos + sumMesesAndDays;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {

    Scanner scaner = new Scanner(System.in);

    System.out.println("Qual o nome da Pessoa Estudante?");
    final String name = scaner.next();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.println("anos:");
    final int years = scaner.nextInt();

    System.out.println("meses:");
    final int meses = scaner.nextInt();

    System.out.println("dias:");
    final int dias = scaner.nextInt();
    scaner.close();

    System.out.println(
        "A idade de " + name + " em dias é " + calcularIdadeEmDias(years, meses, dias) + ".");
  }
}