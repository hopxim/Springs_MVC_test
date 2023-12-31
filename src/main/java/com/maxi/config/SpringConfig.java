package com.maxi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.maxi.service"})
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
