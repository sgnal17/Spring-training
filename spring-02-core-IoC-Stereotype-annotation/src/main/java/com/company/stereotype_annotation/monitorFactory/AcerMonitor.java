package com.company.stereotype_annotation.monitorFactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor{
    public AcerMonitor() {
        super("25 inch beast","Acer",25);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer ");
    }
}
