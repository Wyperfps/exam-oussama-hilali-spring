package com.example.exam.dto;

import com.example.exam.dao.entities.Donateur;
import com.example.exam.dao.entities.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.example.exam.dao.entities.Don}
 */
@AllArgsConstructor
@Getter
@ToString
public class DonDto implements Serializable {
    private final Integer id;
    private final String titre;
    private final double montants;
    private final Type type;

    private List<DonateurDto> donateurs ;
    private ActionDto action;
}