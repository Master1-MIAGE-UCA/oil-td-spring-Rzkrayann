package spring.miage.dice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Getter
@NoArgsConstructor
public class Dice {
    // Class to simulate a dice
    private int value;


    public int roll() {
        // Method to roll the dice
        this.value = new Random().nextInt(6)+1;
        return this.value;
    }

}
