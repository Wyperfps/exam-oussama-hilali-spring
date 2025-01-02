package com.example.exam.mapper;

import com.example.exam.dao.entities.Organisateur;
import com.example.exam.dto.OrganisateurDto;
import org.modelmapper.ModelMapper;

public class OrganisateurMapper {
    private final ModelMapper mapper = new ModelMapper();

    public OrganisateurDto fromOrganisateurToOrganisateurDto(Organisateur organisateur) {
        return mapper.map(organisateur, OrganisateurDto.class);
    }

    public Organisateur fromOrganisateurDtoToOrganisateur(OrganisateurDto organisateurDto) {
        return mapper.map(organisateurDto, Organisateur.class);
    }
}
