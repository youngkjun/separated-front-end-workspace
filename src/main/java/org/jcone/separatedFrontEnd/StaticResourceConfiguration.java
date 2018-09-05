package org.jcone.separatedFrontEnd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
	
	@Value("${spring.thymeleaf.prefix}")
	private String thymeleafTemplatePath;
	
	@Value("${node_modules.path}")
	private String nodeModulesPath;
	
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		
		if (thymeleafTemplatePath != null && !thymeleafTemplatePath.isEmpty()){
			if (!registry.hasMappingForPattern("/**")) {
				registry.addResourceHandler("/**")
						.addResourceLocations(thymeleafTemplatePath);
						//.setCachePeriod(0);
			}
		}
		
		if (nodeModulesPath != null && !nodeModulesPath.isEmpty()){
			if (!registry.hasMappingForPattern("/node_modules/**")) {
				registry.addResourceHandler("/node_modules/**")
						.addResourceLocations(nodeModulesPath);
						//.setCachePeriod(0);
			}
			
		}
	}
}
