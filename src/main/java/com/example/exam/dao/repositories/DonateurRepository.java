package com.example.exam.dao.repositories;

import com.example.exam.dao.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateurRepository extends JpaRepository<Donateur, Integer> {
}