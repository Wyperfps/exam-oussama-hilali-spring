package com.example.exam.mapper;

import com.example.exam.dao.entities.Don;
import com.example.exam.dto.DonDto;
import org.modelmapper.ModelMapper;

public class DonMapper {
    private final ModelMapper mapper = new ModelMapper();
    public DonDto fromDonToDonDto(Don don) {
        return mapper.map(don, DonDto.class);
    }

    public Don fromDonDtoToDon(DonDto donDto) {
        return mapper.map(donDto, Don.class);
    }
}
