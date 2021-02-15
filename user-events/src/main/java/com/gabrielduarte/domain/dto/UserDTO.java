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

    public static UserEntity toEntity(final UserDTO dto, final String idString) {
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
