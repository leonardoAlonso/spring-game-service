package com.example.game_service_api.service;

import com.example.game_service_api.commons.entities.Game;

/**
 * GameService.
 */
public interface GameService {

  Game createGame(Game game);

  Game getGameById(Long id);
}
