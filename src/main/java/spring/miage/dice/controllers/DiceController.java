package spring.miage.dice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.miage.dice.services.DiceService;

import java.util.List;

@RestController
@RequestMapping("/dice")
public class DiceController {

    @Autowired
    private DiceService diceService;

    @GetMapping("/rollDice")
    public List<Integer> rollDice() {
        // Method to roll the dice
        return diceService.roll(1);
    }

    @GetMapping("/rollDices/{X}")
    public List<Integer> rollDices(@PathVariable int X) {
        // Method to roll X dices
        return diceService.roll(X);
    }
}
