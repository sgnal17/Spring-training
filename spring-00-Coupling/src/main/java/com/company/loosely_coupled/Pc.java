package com.company.loosely_coupled;

import com.company.loosely_coupled.caseFactory.Case;
import com.company.loosely_coupled.monitorFactory.Monitor;
import com.company.loosely_coupled.motherboardFactory.Motherboard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pc {
    private Motherboard motherboard;
    private Case theCase;
    private Monitor monitor;

    public Pc(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt();
    }

}
