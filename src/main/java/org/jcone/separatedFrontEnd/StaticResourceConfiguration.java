package org.jcone.separatedFrontEnd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

				/** [John 13:34-35] A new command I give you: Love one another. As I have loved you, so you must love one another. By this everyone will know that you are my disciples, if you love one another. */
@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
	
					/** [1 John 3:18] */
	@Value("${spring.thymeleaf.prefix}")
	private String thymeleafTemplatePath;
	
					/** [1 John 3:18] */
	@Value("${node_modules.path}")
	private String nodeModulesPath;
	
					/** [1 John 3:18] Dear children, let us not love with words or speech but with actions and in truth. */
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
