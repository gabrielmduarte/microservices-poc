package com.gabrielduarte.controller;

import com.gabrielduarte.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/{id}")
    public void send(@PathVariable String id) {
        service.send(id);
    }

}
