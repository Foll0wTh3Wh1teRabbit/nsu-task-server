package ru.nsu.manager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.nsu.manager.exception.VersionNotSupportedException;

@Slf4j
@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(VersionNotSupportedException.class)
    @ResponseStatus(code = HttpStatus.UPGRADE_REQUIRED)
    public void processVersionNotSupported() {
    }

}
