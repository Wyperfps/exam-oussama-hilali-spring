package com.example.exam.service;

import com.example.exam.dao.entities.Don;
import com.example.exam.dao.repositories.DonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonManager implements DonService {

    @Autowired
    private DonRepository donRepository;

    @Override
    public Don addDon(Don don) {
        return donRepository.save(don);
    }

    @Override
    public Don getDonById(Integer id) {
        Optional<Don> don = donRepository.findById(id);
        return don.orElse(null);
    }

    @Override
    public List<Don> getAllDons() {
        return donRepository.findAll();
    }

    @Override
    public List<Don> getDonsByDonateurId(Integer donateurId) {
        return donRepository.findAllByDonateurId(donateurId);
    }

    @Override
    public List<Don> getDonsByActCharId(Integer actionId) {
        return donRepository.findAllByActionId(actionId);
    }

    @Override
    public Don updateDon(Don don) {
        return donRepository.save(don);
    }

    @Override
    public boolean deleteDon(Integer id) {
        if(donRepository.existsById(id)) {return false;}
        donRepository.deleteById(id);
        return true;
    }
}