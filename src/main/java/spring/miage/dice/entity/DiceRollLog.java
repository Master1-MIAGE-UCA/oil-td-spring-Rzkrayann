package spring.miage.dice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
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


}
