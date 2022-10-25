package dev.updooters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Input a valid username.")
public class InvalidUsernameException extends RuntimeException{
}
