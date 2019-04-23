package com.rays.common;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.ray.io.Out;

/**
 * 其他 servlet filter listener 等的配置
 * @author rays1
 *
 */
public class OtherServletConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        
//        DispatcherServlet ds = new DispatcherServlet();
//        ServletRegistration.Dynamic servlet = servletContext.addServlet("appServlet", ds);
//        
//        servlet.addMapping("/");
//        servlet.setMultipartConfig(new MultipartConfigElement("D:\\testDirectory\\app_upload"));
        
        Out.p("加载其他配置");
        
        FilterRegistration.Dynamic filter = servletContext.addFilter("CharacterEncodingFilter", CharacterEncodingFilter.class);
        filter.setInitParameter("encoding", "utf-8");
        filter.addMappingForUrlPatterns(null, false, "*");
        
    }

}
