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

}
