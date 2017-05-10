package com.brickcat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 860117030 on 2017/5/10.
 */
@Configuration
@ComponentScan(basePackages = {"com.brickcat"},
excludeFilters=@ComponentScan.Filter(type = FilterType.ANNOTATION,
value = EnableWebMvc.class))
public class RootConfig {
}
