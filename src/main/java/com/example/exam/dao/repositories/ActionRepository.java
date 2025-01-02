package com.example.exam.dao.repositories;

import com.example.exam.dao.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Integer> {
}