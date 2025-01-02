package com.example.exam.dto;

import com.example.exam.dao.entities.Etat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@Getter
@ToString
public class ActionDto implements Serializable {
    private final Integer id;
    private final String titre;
    private final String description;
    private final Date date;
    private final double montants;
    private final Etat status;
    private List<DonDto> dons ;
    private OrganisateurDto organisateur;
}