package com.company.stereotype_annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.company.stereotype_annotation")
// If we don't specify the packages.It is going to check the package that configuration class in.

public class PcConfig {

}
