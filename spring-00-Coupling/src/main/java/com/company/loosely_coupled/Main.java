package com.company.loosely_coupled;

import com.company.loosely_coupled.caseFactory.Case;
import com.company.loosely_coupled.caseFactory.DellCase;
import com.company.loosely_coupled.monitorFactory.AcerMonitor;
import com.company.loosely_coupled.monitorFactory.Monitor;
import com.company.loosely_coupled.motherboardFactory.AsusMotherboard;
import com.company.loosely_coupled.motherboardFactory.Motherboard;

public class Main {
    public static void main(String[] args) {

        Monitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        Case theCase = new DellCase("220B", "Dell", "240");
        Motherboard theMotherboard = new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Pc myPc=new Pc(theMotherboard,theCase,theMonitor);
        myPc.powerUp();

    }
}
