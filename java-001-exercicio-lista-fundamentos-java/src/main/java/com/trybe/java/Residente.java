package com.trybe.java;

/**
 * Classe.
 **/
public class Residente {

  /**
   * Atributos.
   */
  public String nome;
  public double altura;
  public int idade;
  public double peso;

  /**
   * Método Construtor.
   */
  public Residente(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  /**
   * method of IMC calculator.
   */
  public double calculaImc() {
    return this.peso / (this.altura * this.altura);
  }
}
