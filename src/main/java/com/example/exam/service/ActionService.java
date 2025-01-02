package com.example.exam.service;

import com.example.exam.dao.entities.Action;

import java.util.List;

public interface ActionService {
    Action addAction(Action action);

    Action getActionById(Integer id);

    List<Action> getAllActions();

    Action updateAction(Action action);

    void deleteAction(Integer id);

    List<Action> getAllAction();
}
