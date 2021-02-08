package com.gabrielduarte.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gabrielduarte.domain.UserEntity;
import lombok.Data;

@Data
public class UserDTO {

    private String name;

    private String height;

    private String mass;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("skin_color")
    private String skinColor;

    private String gender;

    private String url;

    public static UserEntity toEntity(UserDTO dto, String idString) {
        UserEntity entity = new UserEntity();
        long id = Long.parseLong(idString);
        long height = Long.parseLong(dto.getHeight());
        long mass = Long.parseLong(dto.getMass());

        entity.setId(id);
        entity.setName(dto.getName());
        entity.setHeight(height);
        entity.setMass(mass);
        entity.setHairColor(dto.getHairColor());
        entity.setSkinColor(dto.getSkinColor());
        entity.setGender(dto.gender);
        entity.setUrl(dto.getUrl());

        return entity;
    }
}
