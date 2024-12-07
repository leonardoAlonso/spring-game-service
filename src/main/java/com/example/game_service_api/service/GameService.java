package com.example.game_service_api.service;

import com.example.game_service_api.entities.Game;
import com.example.game_service_api.repository.GameRepository;

import org.springframework.stereotype.Service;

@Service
public class GameService {

  private final GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  public Game createGame(Game gameRequest) {
    return gameRepository.save(gameRequest);
  }

}
