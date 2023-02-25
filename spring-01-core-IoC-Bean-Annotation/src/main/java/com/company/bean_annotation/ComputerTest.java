package com.company.bean_annotation;



import com.company.bean_annotation.caseFactory.Case;
import com.company.bean_annotation.caseFactory.DellCase;
import com.company.bean_annotation.config.ComputerConfig;
import com.company.bean_annotation.monitorFactory.Monitor;
import com.company.bean_annotation.monitorFactory.SonyMonitor;
import com.company.bean_annotation.motherboardFactory.AsusMotherboard;
import com.company.bean_annotation.motherboardFactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        //Creating container by using Application Context
        ApplicationContext container=new AnnotationConfigApplicationContext(ComputerConfig.class);

        //Creating container by using BeanFactory
        BeanFactory context=new AnnotationConfigApplicationContext();

        System.out.println("-----------Retrieving the beans------------------");
        SonyMonitor sonyMonitor=container.getBean(SonyMonitor.class);
        DellCase dellCase=container.getBean(DellCase.class);
        AsusMotherboard asusMotherboard=container.getBean(AsusMotherboard.class);

        Computer pc=new Computer(dellCase,asusMotherboard,sonyMonitor);

        pc.powerUp();

        System.out.println("-----------Retrieving the beans------------------");

//        Monitor theMonitor = container.getBean(Monitor.class);
//        Case theCase = container.getBean(Case.class);
//        Motherboard theMotherboard = container.getBean(Motherboard.class);
//
//        Computer pc2 = new Computer(theCase,theMonitor,theMotherboard);


        System.out.println("-----------Multiple Objects------------------");

        Monitor theMonitor2 = container.getBean("sonyMonitor", Monitor.class);  //DEFAULT BEAN NAME(method name)
        Monitor theMonitor3 = container.getBean("sony", Monitor.class);  //CUSTOM BEAN NAME
        Monitor theMonitor4 = container.getBean( Monitor.class);  //@Primary







    }
}
