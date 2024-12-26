package com.example.game_service_api.commons.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * GameException.
 */

@Getter
public class GameException extends RuntimeException {

  private HttpStatus httpStatus;

  public GameException(HttpStatus httpStatus, String message) {
    super(message);
    this.httpStatus = httpStatus;
  }

}
