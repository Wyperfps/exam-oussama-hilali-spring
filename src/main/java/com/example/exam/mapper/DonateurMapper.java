package com.example.exam.mapper;

import com.example.exam.dao.entities.Donateur;
import com.example.exam.dto.DonateurDto;
import org.modelmapper.ModelMapper;

public class DonateurMapper {
    private final ModelMapper mapper = new ModelMapper();

    public DonateurDto fromDonateurToDonateurDto(Donateur donateur) {
        return mapper.map(donateur, DonateurDto.class);
    }

    public Donateur fromDonateurDtoToDonateur(DonateurDto DonateurDto) {
        return mapper.map(DonateurDto, Donateur.class);
    }

    public DonateurDto toDonateurDto(Donateur donateurOpt) {
    }


    public Donateur toDonateur(DonateurDto donateurDto) {
        return null;
    }
}
