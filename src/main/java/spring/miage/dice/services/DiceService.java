package spring.miage.dice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.miage.dice.Dice;
import spring.miage.dice.entity.DiceRollLog;
import spring.miage.dice.interfaces.DiceRepository;

import java.util.ArrayList;

import java.util.List;

@Service
public class DiceService {
    @Autowired
    private Dice dice;

    @Autowired
    private DiceRepository diceRepository;

    public List<Integer> roll(int n) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(dice.roll());
        }
        DiceRollLog log = new DiceRollLog(n, values, java.time.LocalDateTime.now());
        diceRepository.save(log);
        return values;
    }

}
