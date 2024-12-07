
package com.example.game_service_api.controller;

import com.example.game_service_api.entities.Game;
import com.example.game_service_api.service.GameService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

  private final GameService gameService;

  public GameController(GameService gameService) {
    this.gameService = gameService;
  }
  
  @PostMapping
  public ResponseEntity<Game> createGame(@RequestBody Game game) {
    Game savedGame = gameService.createGame(game);
    return ResponseEntity.ok(savedGame);
    
    
  }

  
}
