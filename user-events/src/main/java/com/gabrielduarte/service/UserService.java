package com.gabrielduarte.service;

import com.gabrielduarte.domain.UserEntity;
import com.gabrielduarte.domain.dto.UserDTO;
import com.gabrielduarte.feign.SwapiClient;
import com.gabrielduarte.mapper.UserMapper;
import com.gabrielduarte.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final SwapiClient swapiClient;
    private final UserMapper mapper;

    public void save(final String id) {
        final UserDTO dto = swapiClient.getCharacterById(id);
        final UserEntity entity = mapper.toEntity(dto, id);

        userRepository.save(entity);
    }

    public void update(final String id) {
        final UserDTO dto = swapiClient.getCharacterById(id);
        final UserEntity entity = mapper.toEntity(dto, id);

        userRepository.save(entity);
    }

    public boolean userExists(final String id) {
        return userRepository.existsById(Long.valueOf(id));
    }

}
