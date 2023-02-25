package com.company.bean_annotation.caseFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public abstract class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;

    public abstract void pressPowerButton();

}
