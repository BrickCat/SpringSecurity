package com.brickcat;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Seven on 17/5/9.
 */
public class WebConfigInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    //将DispatcherServlet 映射到“/”
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
