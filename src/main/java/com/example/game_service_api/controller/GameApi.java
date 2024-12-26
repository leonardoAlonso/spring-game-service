package com.example.game_service_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.game_service_api.commons.entities.Game;
import com.example.game_service_api.commons.constants.ApiPathVariables;


@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {
  @PostMapping
  ResponseEntity<Game> createGame(@RequestBody Game game);

  @GetMapping("/{id}")
  ResponseEntity<Game> getGameById(@PathVariable Long id);
}
