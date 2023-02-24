package com.company.loosely_coupled.monitorFactory;

public class SonyMonitor extends Monitor{
    public SonyMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }


    public void drawPixelAt() {
        System.out.println("Drqing pixel with Sony");
    }
}
