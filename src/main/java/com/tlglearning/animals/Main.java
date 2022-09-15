package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Wolf> wolves = new ArrayList<>();
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);

    for (Wolf w : wolves){
      System.out.println();
      System.out.println(w.getClass().getName());
      w.hunt();
      w.vocalize();
      // Another way to do it would be Dog d = (Dog) w; ((Dog)w).rollOver();
      if (w instanceof Dog) {
        ((Dog)w).rollOver();
      }
    }


  }

}
