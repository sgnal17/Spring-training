package com.company.bean_annotation.caseFactory;

public class DellCase extends Case {
    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
