package com.example.game_service_api.repository;

import com.example.game_service_api.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Long>{}