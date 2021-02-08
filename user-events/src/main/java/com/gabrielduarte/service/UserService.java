package com.gabrielduarte.service;

import com.gabrielduarte.domain.UserEntity;
import com.gabrielduarte.domain.dto.UserDTO;
import com.gabrielduarte.feign.UserConsumer;
import com.gabrielduarte.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserConsumer userConsumer;

    public void saveOrUpdate(String id) {
        UserDTO dto = userConsumer.getCharacterById(id);
        UserEntity entity = UserDTO.toEntity(dto, id);

        userRepository.save(entity);
    }

}
