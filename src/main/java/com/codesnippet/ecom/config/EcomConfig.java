package com.codesnippet.ecom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.codesnippet.ecomassistant.service.DepricatedUtilityService;

@Configuration
@ComponentScan(
		basePackages = "com.codesnippet.ecomassistant",
		excludeFilters = @ComponentScan.Filter
		(type = FilterType.ASSIGNABLE_TYPE,
		classes = DepricatedUtilityService.class)
)
public class EcomConfig {

}
