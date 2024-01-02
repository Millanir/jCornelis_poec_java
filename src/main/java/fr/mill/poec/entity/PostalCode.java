package fr.mill.poec.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostalCode implements EntityInterface{

    private Long id;
    private int code;
    private int cityId;
}