package com.brickcat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 860117030 on 2017/5/10.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.brickcat")
public class WebConfig {
}
