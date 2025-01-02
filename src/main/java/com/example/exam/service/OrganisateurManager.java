package com.example.exam.service;

import com.example.exam.dao.entities.Organisateur;
import com.example.exam.dao.repositories.OrganisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisateurManager implements OrganisateurService {

    @Autowired
    private OrganisateurRepository organisateurRepository;

    @Override
    public Organisateur addOrganisateur(Organisateur organisateur) {
        return organisateurRepository.save(organisateur);
    }

    @Override
    public Organisateur getOrganisateurById(Integer id) {
        Organisateur organisateur = organisateurRepository.findById(id).get();
        return organisateur;
    }

    @Override
    public List<Organisateur> getAllOrganisateurs() {
        return organisateurRepository.findAll();
    }

    @Override
    public Organisateur updateOrganisateur(Organisateur organisateur) {
        return organisateurRepository.save(organisateur);
    }

    @Override
    public boolean deleteOrganisateur(Integer id) {
        if (organisateurRepository.existsById(id)) {return false;}
        organisateurRepository.deleteById(id);
        return true;
    }
}
