package com.company.stereotype_annotation;

import com.company.stereotype_annotation.caseFactory.Case;
import com.company.stereotype_annotation.monitorFactory.Monitor;
import com.company.stereotype_annotation.motherboardFactory.Motherboard;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public class Pc {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Pc(Case theCase, Motherboard motherboard, Monitor monitor) {
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
