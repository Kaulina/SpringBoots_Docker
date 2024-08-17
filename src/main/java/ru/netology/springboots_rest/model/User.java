package ru.netology.springboots_rest.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.NotBlank;

@Validated
public class User {

    @NotNull
    @NotBlank
    @Size(min = 2, max = 100)
    private final String name;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 100)
    private final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}