package dev.updooters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Content or title cannot be empty.")
public class ContentEmptyException extends RuntimeException{
}
