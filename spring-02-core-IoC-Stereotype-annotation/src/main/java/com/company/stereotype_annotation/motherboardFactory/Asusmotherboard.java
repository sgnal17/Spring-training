package com.company.stereotype_annotation.motherboardFactory;

import org.springframework.stereotype.Component;

@Component
public class Asusmotherboard extends Motherboard{
    public Asusmotherboard() {
        super("3232","Asus",3,5,"sffs");
    }

    @Override
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
