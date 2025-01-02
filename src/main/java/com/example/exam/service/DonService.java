package com.example.exam.service;

import com.example.exam.dao.entities.Don;

import java.util.List;

public interface DonService {
    Don addDon(Don don);

    Don getDonById(Integer id);

    List<Don> getAllDons();

    List<Don> getDonsByDonateurId(Integer donateurId);

    List<Don> getDonsByActCharId(Integer actionId);

    Don updateDon(Don don);

    boolean deleteDon(Integer id);

    List<Don> getDonsByActionsId(Integer id);
}
