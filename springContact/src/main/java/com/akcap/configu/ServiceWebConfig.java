package com.akcap.configu;

import org.apache.taglibs.standard.tlv.JstlBaseTLV;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages={"com.akcap"})
@EnableWebMvc
public class ServiceWebConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);
	}
	@Bean
	public ViewResolver resolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
