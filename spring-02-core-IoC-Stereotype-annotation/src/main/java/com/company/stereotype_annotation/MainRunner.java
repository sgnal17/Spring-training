package com.company.stereotype_annotation;

import com.company.stereotype_annotation.config.PcConfig;
import com.company.stereotype_annotation.monitorFactory.Monitor;
import com.company.stereotype_annotation.monitorFactory.SonyMonitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor monitor1=context.getBean(SonyMonitor.class);
        monitor1.drawPixelAt();

    }
}
