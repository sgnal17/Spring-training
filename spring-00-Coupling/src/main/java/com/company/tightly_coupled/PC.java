package com.company.tightly_coupled;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PC {
    AcerMonitor monitor;
    AsusMotherboard motherboard;
    DellCase theCase;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1100, 60, "yellow");
    }

}
