package com.distribuida.principal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosEmpresa.properties")
public class Config {
	
	

}
