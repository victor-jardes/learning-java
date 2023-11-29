package com.trybe.java;

public class SmartHouse {
  public boolean lamp;

  public SmartHouse() {
    this.lamp = false;
  }

  public void ligarLampada() {
    this.lamp = true;
  }

  public void desligarLampada() {
    this.lamp = false;
  }

  public boolean isLampadaLigada() {
    return this.lamp;
  }

  /**
   * `conectarInternet` method, this method return true or false.
   */
  public boolean conectarInternet(double connectionRate) {
    if (connectionRate > 0.5) {
      return true;
    } else {
      return false;
    }
  }

}
