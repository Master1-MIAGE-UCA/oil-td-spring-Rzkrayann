package spring.miage.dice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.miage.dice.entity.DiceRollLog;
import spring.miage.dice.interfaces.DiceRepository;

import java.util.List;

// Controller for logs operations
@RestController
@Tag(name = "Logs Controller", description = "Controller for logs operations")
public class LogsController {
    // Repository to handle logs operations
    @Autowired
    private DiceRepository diceRepository;

    @GetMapping("/diceLogs")
    @Operation(summary = "Show roll history")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "History successfully loaded", content = @Content(examples = @ExampleObject(value = "{\"id\":1,\"diceCount\":87,\"diceValues\":[5,6,6,5,4,3,3,5,5,2],\"rollingTime\":\"2024-12-13T10:24:54.1078\"}")))
    })
    public ResponseEntity<List<DiceRollLog>> diceLogs() {
        // Method to show the roll history
        List<DiceRollLog> logs = diceRepository.findAll();
        return ResponseEntity.ok(logs);
    }
}
