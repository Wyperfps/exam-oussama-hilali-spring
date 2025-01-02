package com.example.exam.mapper;


import com.example.exam.dao.entities.Action;
import com.example.exam.dto.ActionDto;
import org.modelmapper.ModelMapper;


public class ActionMapper {
    private final ModelMapper mapper = new ModelMapper();

    public ActionDto fromActionToActionDto(Action action) {
        return mapper.map(action, ActionDto.class);
    }

    public Action fromActionDtoToAction(ActionDto ActionDto) {
        return mapper.map(ActionDto, Action.class);
    }
}
