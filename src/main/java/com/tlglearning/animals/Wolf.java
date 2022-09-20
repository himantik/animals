package com.tlglearning.animals;

public class Wolf {

  private static final int MY_CONSTANT = initializedValue();
  private int data = initializeData();

  static {
    System.out.println("Wolf static initialization block");
  }

  {
    System.out.println("Wolf instance initialization block");
  }

  public Wolf() {
    super();
    System.out.println("Wolf constructor");
  }

  private static int initializedValue() {
    System.out.println("Wolf.initializeValue");
    return -1;

  }

  private int initializeData() {
    System.out.println("Wolf.initializeData");
    return 1;
  }

  public void vocalize() {
    System.out.println("Howl like a wolf!");
  }

  public void hunt() {
    System.out.println("Hunt in packs for live prey");
  }

  public static void whoAmI() {
    System.out.println("I am a wolf");
  }

}
