package com.rays.config;

import javax.servlet.ServletContext;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.rays.common.Log;

/**
 * 安全功能配置
 * @author rays1
 *
 */
@Order(3)
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    
    @Override
    protected void afterSpringSecurityFilterChain(ServletContext servletContext) {
        super.afterSpringSecurityFilterChain(servletContext);
        Log.p("afterSpringSecurityFilterChain");
    }
    
    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
        super.beforeSpringSecurityFilterChain(servletContext);
        
        Log.p("beforeSpringSecurityFilterChain");
    }
    
}
