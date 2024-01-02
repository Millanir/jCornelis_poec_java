package fr.mill.poec.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Department implements EntityInterface{

    private Long id;
    private int regionId;
    private int code;
    private String name;
}