package com.rays.config;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.ray.io.Out;

/**
 * 安全功能配置
 * @author rays1
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        Out.p("加载 SecurityWebInitializer");
    }
    
    
    @Override
    protected void afterSpringSecurityFilterChain(ServletContext servletContext) {
        super.afterSpringSecurityFilterChain(servletContext);
        Out.p("afterSpringSecurityFilterChain");
    }
    
    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
        super.beforeSpringSecurityFilterChain(servletContext);
        
        Out.p("beforeSpringSecurityFilterChain");
    }
    
}
