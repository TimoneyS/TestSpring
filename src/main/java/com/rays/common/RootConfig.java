package com.rays.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(
        basePackageClasses = {
                com.rays.repository.PackageInfo.class
        })
public class RootConfig {

}
