package com.company.config;

import com.company.casefactory.Case;
import com.company.casefactory.DellCase;
import com.company.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){
        return new Dimensions(50,10,10);
    }


    @Bean
    public Case caseDell(Dimensions dimensions){
        //when we pass as a parameter we are doing direct wiring
        return new DellCase("220B","Dell","240",dimensions);
    }

}
