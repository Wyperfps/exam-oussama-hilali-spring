package com.example.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.example.exam.dao.entities.Organisateur}
 */
@AllArgsConstructor
@Getter
@ToString
public class OrganisateurDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String email;
    private List<ActionDto> actions ;
}