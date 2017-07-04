package com.guilherme.miguel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Order not found exception
 *
 * @author Miguel Guilherme
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Order not found!")
public class OrderNotFoundException extends RuntimeException {

}
