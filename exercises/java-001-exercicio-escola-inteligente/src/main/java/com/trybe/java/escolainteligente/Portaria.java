package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int sumStudents = qtdFundamental1 + qtdFundamental2 + qtdMedio;

    double somaFundamental1 = 0d;
    double somaFundamental2 = 0d;
    double somaMedio = 0d;

    if (sumStudents > 0) {
      somaFundamental1 = 100.0 * qtdFundamental1 / sumStudents;
      somaFundamental2 = 100.0 * qtdFundamental2 / sumStudents;
      somaMedio = 100.0 * qtdMedio / sumStudents;
    }

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + String.format("%.1f", somaFundamental1) + "%");
    System.out.println("Ensino Fundamental II: " + String.format("%.1f", somaFundamental2) + "%");
    System.out.println("Ensino Médio: " + String.format("%.1f", somaMedio) + "%");
    System.out.println();
    System.out.println("TOTAL: " + sumStudents);

    // Locale.setDefault(Locale.US);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    boolean gerarRelatorio = false;

    int getInputNumber;

    String fundamental1Msg = "Pessoa estudante do Ensino Fundamental I, catraca liberada!";
    String fundamental2Msg = "Pessoa estudante do Ensino Fundamental II, catraca liberada!";
    String medioMsg = "Pessoa estudante do Ensino Médio, catraca liberada!";

    final int idadeMinimaFundamental2 = 11;
    final int idadeMinimaMedio = 15;

    int qtdFundamental1 = 0;
    int qtdFundamental2 = 0;
    int qtdMedio = 0;

    while (gerarRelatorio == false) {
      System.out.println("Entre com o número correspondente à opção desejada:\n");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");
      getInputNumber = scanner.nextInt();
      int age;

      if (getInputNumber == 1) {
        System.out.println("Informe a idade da pessoa estudante: ");
        age = scanner.nextInt();
        if (age >= idadeMinimaMedio) {
          System.out.println(medioMsg);
          qtdMedio++;
        } else if (age >= idadeMinimaFundamental2) {
          System.out.println(fundamental2Msg);
          qtdFundamental2++;
        } else {
          System.out.println(fundamental1Msg);
          qtdFundamental1++;
        }
      } else if (getInputNumber == 2) {
        emitirRelatorio(qtdFundamental1, qtdFundamental2, qtdMedio);
        gerarRelatorio = true;
      } else {
        System.out.println("Entre com uma opção válida!");
      }

    }

    scanner.close();
  }
}
