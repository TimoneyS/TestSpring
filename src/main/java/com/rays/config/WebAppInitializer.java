package com.rays.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 替代webxml的配置
 * 
 * @author rays1
 *
 */
@Order(1)
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
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }
    
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        // 配置 mutipart 的上传路径
        registration.setLoadOnStartup(1);
        registration.setMultipartConfig(new MultipartConfigElement("D:\\testDirectory\\app_upload", 2097152, 4194304, 0));
    }
    
}
