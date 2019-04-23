package com.rays.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(
        basePackageClasses = {
                com.rays.repository.PackageInfo.class
        })
@Import(value= {DatabaseConfig.class})
public class RootConfig {

}
