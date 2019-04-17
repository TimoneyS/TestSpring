package com.rays.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.rays.entity.PetMaster;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {com.rays.entity.PackageInfo.class})
@Import(WebConfig.class)
public class JavaConfig {

    @Bean
    public PetMaster petMaster() {
        return new PetMaster();
    }
    
}
