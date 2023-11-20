package com.maxi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.maxi.controller","com.maxi.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
