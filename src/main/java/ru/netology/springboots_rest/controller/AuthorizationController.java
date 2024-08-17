package ru.netology.springboots_rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springboots_rest.enums.Authorities;
import ru.netology.springboots_rest.exception.InvalidCredentials;
import ru.netology.springboots_rest.exception.UnauthorizedUser;
import ru.netology.springboots_rest.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) throws InvalidCredentials, UnauthorizedUser {
        return service.getAuthorities(user, password);
    }
}
