package com.example.exam.dto;

import com.example.exam.dao.entities.Evaluation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.example.exam.dao.entities.Donateur}
 */
@AllArgsConstructor
@Getter
@ToString
public class DonateurDto implements Serializable {
    private final Integer id;
    private final String persinfo;
    private final Evaluation eval;

    private DonDto don;
}