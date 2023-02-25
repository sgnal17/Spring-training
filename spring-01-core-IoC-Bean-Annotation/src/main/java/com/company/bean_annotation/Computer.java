package com.company.bean_annotation;


import com.company.bean_annotation.caseFactory.Case;
import com.company.bean_annotation.monitorFactory.Monitor;
import com.company.bean_annotation.motherboardFactory.Motherboard;

public class Computer {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Computer(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    public void drawLogo(){
        monitor.drawPixelAt();
    }
}
