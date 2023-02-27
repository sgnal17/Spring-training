package com.company.bean_annotation.config;

import com.company.bean_annotation.caseFactory.Case;
import com.company.bean_annotation.caseFactory.DellCase;
import com.company.bean_annotation.monitorFactory.AcerMonitor;
import com.company.bean_annotation.monitorFactory.Monitor;
import com.company.bean_annotation.monitorFactory.SonyMonitor;
import com.company.bean_annotation.motherboardFactory.AsusMotherboard;
import com.company.bean_annotation.motherboardFactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ComputerConfig {

    @Bean
    public Case dellCase(){
        return new DellCase("120A","Dell","220");
    }

    @Bean(name = "acer")
    //@Primary
    public Monitor acerMonitor(){
        return new AcerMonitor("27inch Beast","Acer",27);
    }

    @Bean
    //@Bean(name="sony)
    public Monitor sonyMonitor(){
        return new SonyMonitor("34inch C+","Sony",34);
    }

    @Bean
    public Motherboard asusMotherboard(){
        return new AsusMotherboard("v5.5","Asus",4,3,"v5");
    }





}
