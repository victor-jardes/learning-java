package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double sum = (nota1 + nota2 + nota3 + nota4) / 4;
    return sum;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scaner = new Scanner(System.in);

    String nome;
    System.out.println("Qual o nome da Pessoa Estudante?");
    nome = scaner.next();

    double n1;
    System.out.println("Entre com as notas das provas:");
    System.out.println("Avaliação 1:");
    String nota1 = scaner.next();
    n1 = Double.parseDouble(nota1);

    double n2;
    System.out.println("Avaliação 2:");
    String nota2 = scaner.next();
    n2 = Double.parseDouble(nota2);

    double n3;
    System.out.println("Avaliação 3:");
    String nota3 = scaner.next();
    n3 = Double.parseDouble(nota3);

    double n4;
    System.out.println("Avaliação 4:");
    String nota4 = scaner.next();
    n4 = Double.parseDouble(nota4);

    scaner.close();
    System.out.println("A média das notas de " + nome + " é " + calcularMedia(n1, n2, n3, n4));
  }
}
