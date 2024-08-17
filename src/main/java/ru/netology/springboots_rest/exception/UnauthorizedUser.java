package ru.netology.springboots_rest.exception;

public class UnauthorizedUser extends Throwable {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
