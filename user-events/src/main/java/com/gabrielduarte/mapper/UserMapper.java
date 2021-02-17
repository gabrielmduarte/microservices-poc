package com.gabrielduarte.mapper;

import com.gabrielduarte.domain.UserEntity;
import com.gabrielduarte.domain.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(final UserDTO dto, final String idString) {
        UserEntity entity = new UserEntity();

        entity.setId(Long.parseLong(idString));
        entity.setName(dto.getName());
        entity.setHeight(Long.parseLong(dto.getHeight()));
        entity.setMass(Long.parseLong(dto.getMass()));
        entity.setHairColor(dto.getHairColor());
        entity.setSkinColor(dto.getSkinColor());
        entity.setGender(dto.getGender());
        entity.setUrl(dto.getUrl());

        return entity;
    }

}
