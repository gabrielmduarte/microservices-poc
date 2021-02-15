package com.gabrielduarte.service;

import com.gabrielduarte.domain.UserEntity;
import com.gabrielduarte.domain.dto.UserDTO;
import com.gabrielduarte.feign.SwapiClient;
import com.gabrielduarte.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final SwapiClient swapiClient;

    public void saveOrUpdate(final String id) {
        final UserDTO dto = swapiClient.getCharacterById(id);
        final UserEntity entity = UserDTO.toEntity(dto, id);

        userRepository.save(entity);
    }
//metodo p criar e atualizar
}
