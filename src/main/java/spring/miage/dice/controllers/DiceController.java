package spring.miage.dice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.miage.dice.services.DiceService;

import java.util.List;

// Controller for dice operations
@RestController
@Tag(name = "Dice Controller", description = "Controller for dice operations")
public class DiceController {

    // Service to handle dice operations
    @Autowired
    private DiceService diceService;

    @Operation(summary = "Roll a dice")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dice rolled successfully", content = @Content(examples = @ExampleObject(value = "[3]"))),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/rollDice")
    public List<Integer> rollDice() {
        // Method to roll the dice
        return diceService.roll(1);
    }

    @Operation(summary = "Roll multiple dices")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dice rolled successfully", content = @Content(examples = @ExampleObject(value = "[2,4,5]"))),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/rollDices/{X}")
    public List<Integer> rollDices(@PathVariable int X) {
        // Method to roll X dices
        return diceService.roll(X);
    }
}
