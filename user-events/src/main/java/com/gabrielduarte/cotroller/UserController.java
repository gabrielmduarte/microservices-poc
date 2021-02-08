package com.gabrielduarte.cotroller;

import com.gabrielduarte.domain.UserEntity;
import com.gabrielduarte.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping
    public List<UserEntity> get() {
        return repository.findAll();
    }
}
