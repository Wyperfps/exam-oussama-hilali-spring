package com.example.exam.dao.repositories;

import com.example.exam.dao.entities.Don;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonRepository extends JpaRepository<Don, Integer> {
    List<Don> findAllByActionId(Integer actionId);

    List<Don> findAllByDonateurId(Integer donateurId);
}