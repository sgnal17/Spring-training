package com.company.stereotype_annotation.caseFactory;

import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case{
    public DellCase() {
        super("2208","Dell","240");
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
