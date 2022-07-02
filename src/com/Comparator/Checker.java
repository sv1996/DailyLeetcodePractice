package com.Comparator;

import java.util.Comparator;

public class Checker implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.playerScore == o2.playerScore) {
          //  return 0;
            return o1.playerName.compareTo(o2.playerName);
        }
        if (o1.playerScore < o2.playerScore) {
            return -1;
        } else {
            return 1;
        }


    }
}
