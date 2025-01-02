package com.example.exam.service;

import com.example.exam.dao.entities.Action;
import com.example.exam.dao.repositories.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActionManager implements ActionService {

    @Autowired
    private ActionRepository actionRepository;

    @Override
    public Action addAction(Action action) {
        return actionRepository.save(action);
    }

    @Override
    public Action getActionById(Integer id) {
        Optional<Action> action = actionRepository.findById(id);
        return action.orElse(null);
    }

    @Override
    public List<Action> getAllActions() {
        return actionRepository.findAll();
    }

    @Override
    public Action updateAction(Action action) {
        return actionRepository.save(action);
    }

    @Override
    public void deleteAction(Integer id) {
        actionRepository.deleteById(id);
    }
}

