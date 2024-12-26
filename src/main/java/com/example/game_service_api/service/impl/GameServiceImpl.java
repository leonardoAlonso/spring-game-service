package com.example.game_service_api.service;

import com.example.game_service_api.commons.entities.Game;
import com.example.game_service_api.repository.GameRepository;
import com.example.game_service_api.service.GameService;
import com.example.game_service_api.commons.exceptions.GameException;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

/**
 * GameServiceImpl.
 */

@Service
public class GameServiceImpl implements GameService {

  private final GameRepository gameRepository;

  public GameServiceImpl(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }
  
  @Override
  public Game createGame(Game gameRequest) {
    return gameRepository.save(gameRequest);
  }

  @Override
  public Game getGameById(Long id) {
    return gameRepository.findById(id).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Game not found"));
  }

}
