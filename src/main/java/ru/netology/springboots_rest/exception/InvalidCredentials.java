package ru.netology.springboots_rest.exception;

public class InvalidCredentials extends Throwable {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}
