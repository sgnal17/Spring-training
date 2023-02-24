package com.company.tightly_coupled;

public class Main {
    public static void main(String[] args) {

        AcerMonitor monitor=new AcerMonitor("27inch Beast","Acer",27);
        AsusMotherboard motherboard=new AsusMotherboard("BJ-200","Asus",4,4,"v2.44");
        DellCase theCase=new DellCase("220B","Dell","240");

        PC myPc=new PC(monitor,motherboard,theCase);
        myPc.powerUp();
    }
}
