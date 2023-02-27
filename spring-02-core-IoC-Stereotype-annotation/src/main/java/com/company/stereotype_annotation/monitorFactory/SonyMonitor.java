package com.company.stereotype_annotation.monitorFactory;

import org.springframework.stereotype.Component;

@Component
public class SonyMonitor extends Monitor{
    public SonyMonitor() {
        super("25 inch beast","Sony",25);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
