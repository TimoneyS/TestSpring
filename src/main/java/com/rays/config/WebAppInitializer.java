package com.rays.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ray.io.Out;

/**
 * 替代webxml的配置
 * 
 * @author rays1
 *
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        Out.p("加载 root config");
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // 指定 servlet 配置类
        Out.p("加载 servlet config");
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // 映射 DispatchServlet
        Out.p("映射 / 到 dispatchServlet");
        return new String[] {"/"};
    }
    
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        // 配置 mutipart 的上传路径
        registration.setMultipartConfig(new MultipartConfigElement("D:\\testDirectory\\app_upload", 2097152, 4194304, 0));
    }

}
