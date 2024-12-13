package spring.miage.dice;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice {
    // Class to simulate a dice
    private int value;

    public Dice() {
        // Constructor
        this.value = 0;
    }

    public int roll() {
        // Method to roll the dice
        this.value = new Random().nextInt(6)+1;
        return this.value;
    }

    public int getValue() {
        // Method to get the value of the dice
        return this.value;
    }
}
