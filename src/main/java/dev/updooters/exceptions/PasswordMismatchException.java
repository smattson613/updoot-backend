package dev.updooters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "The password does not match.")
public class PasswordMismatchException extends RuntimeException{
}
