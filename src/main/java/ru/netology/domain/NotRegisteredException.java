package ru.netology.domain;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException (String e) {
        super(e);
    }

}
