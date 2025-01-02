package com.example.exam.service;

import com.example.exam.dto.DonateurDto;

import java.util.List;

public interface DonateurService {
    DonateurDto addDonateur(DonateurDto donateurDto);

    DonateurDto getDonateurById(Integer id);

    List<DonateurDto> getAllDonateurs();

    boolean deleteDonateur(Integer id);
}
