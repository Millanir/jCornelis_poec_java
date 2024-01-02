package fr.mill.poec.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class City implements EntityInterface{

    private Long id;
    private int siren;
    private int population;
    private String name;
    private int code;
}