package com.example.game_service_api.controller.impl;

import com.example.game_service_api.commons.dto.ErrorResponse;
import com.example.game_service_api.commons.exceptions.GameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class ExceptionHandlerController {

  @ExceptionHandler(value = {GameException.class})
  ResponseEntity<ErrorResponse> handleError(GameException ex) {
      
    // log.error("GameException: {}", ex);
    var errorResponse = ErrorResponse.builder()
        .statusCode(ex.getHttpStatus().value())
        .message(ex.getMessage())
        .build();

    return ResponseEntity.status(ex.getHttpStatus()).body(errorResponse);

  }



}
