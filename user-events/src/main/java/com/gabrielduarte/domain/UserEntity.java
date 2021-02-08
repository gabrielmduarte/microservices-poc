package com.gabrielduarte.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
@Entity
public class UserEntity {

    @Id
    private Long id;

    private String name;

    private Long height;

    private Long mass;

    private String hairColor;

    private String skinColor;

    private String gender;

    private String url;

}
