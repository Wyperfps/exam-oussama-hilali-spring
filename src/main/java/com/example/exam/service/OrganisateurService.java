package com.example.exam.service;

import com.example.exam.dao.entities.Organisateur;

import java.util.List;

public interface OrganisateurService {
    Organisateur addOrganisateur(Organisateur organisateur);

    Organisateur getOrganisateurById(Integer id);

    List<Organisateur> getAllOrganisateurs();

    Organisateur updateOrganisateur(Organisateur organisateur);

    boolean deleteOrganisateur(Integer id);
}
