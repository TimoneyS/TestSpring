package com.rays.common;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // 指定 servlet 配置类
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // 映射 DispatchServlet
        return new String[] {"/"};
    }

}
