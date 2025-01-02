package com.example.exam.service;

import com.example.exam.dao.entities.Donateur;
import com.example.exam.dto.DonateurDto;
import com.example.exam.mapper.DonateurMapper;
import com.example.exam.dao.repositories.DonateurRepository;
import com.example.exam.service.DonateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonateurManager implements DonateurService {

    @Autowired
    private DonateurRepository donateurRepository;

    @Autowired
    private DonateurMapper donateurMapper;

    @Override
    public DonateurDto addDonateur(DonateurDto donateurDto) {
        Donateur donateur = donateurMapper.toDonateur(donateurDto);
        donateur = donateurRepository.save(donateur);
        return donateurMapper.toDonateurDto(donateur);
    }

    @Override
    public DonateurDto getDonateurById(Integer id) {
        Donateur donateurOpt = donateurRepository.findById(id).get();
        return donateurMapper.toDonateurDto(donateurOpt);
    }

    @Override
    public List<DonateurDto> getAllDonateurs() {
        List<Donateur> donateurs = donateurRepository.findAll();
        return donateurs.stream()
                .map(donateurMapper::toDonateurDto)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteDonateur(Integer id) {
        if(donateurRepository.existsById(id)) {return false;}
        donateurRepository.deleteById(id);
        return true;
    }


}