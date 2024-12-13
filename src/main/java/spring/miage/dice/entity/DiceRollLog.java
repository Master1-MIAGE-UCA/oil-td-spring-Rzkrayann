package spring.miage.dice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class DiceRollLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int diceCount;
    @ElementCollection
    private List<Integer> diceValues;
    private LocalDateTime rollingTime;


    public DiceRollLog(int diceCount, List<Integer> diceValues, LocalDateTime rollingTime) {
        // Constructor
        this.diceCount = diceCount;
        this.diceValues = diceValues;
        this.rollingTime = rollingTime;
    }

    public Long getId() {
        return id;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public List<Integer> getDiceValues() {
        return diceValues;
    }

    public LocalDateTime getRollingTime() {
        return rollingTime;
    }
}
