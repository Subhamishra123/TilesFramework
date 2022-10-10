package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class WebMvcConfigurer {
	
	@Bean
	protected TilesConfigurer createConfigurer()
	{
		TilesConfigurer cfg=new TilesConfigurer();
		cfg.setDefinitions("/WEB-INF/tiles.xml");
		return cfg;
	}
	@Bean
	protected TilesViewResolver createResolver()
	{
		TilesViewResolver resolver=new TilesViewResolver();
		return resolver;
	}

}
