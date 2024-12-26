
package com.example.game_service_api.controller.impl;

import com.example.game_service_api.controller.GameApi;
import com.example.game_service_api.commons.entities.Game;
import com.example.game_service_api.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * GameController.
 */
@RestController
public class GameController implements GameApi {

  private final GameService gameService;


  /**
   * Constructor.
   *
   * @param gameService the service instance to be injected that handles the game operations
   */
  public GameController(GameService gameService) {
    this.gameService = gameService;
  }

  /**
   * Create a new game.
   *
   * @param game the game instance
   * @return the saved game
   */
  
  @Override
  public ResponseEntity<Game> createGame(@RequestBody Game game) {
    Game savedGame = gameService.createGame(game);
    return ResponseEntity.ok(savedGame);
  }

  @Override
  public ResponseEntity<Game> getGameById(Long id) {
    Game game = gameService.getGameById(id);
    return ResponseEntity.ok(game);
  }

  
}
