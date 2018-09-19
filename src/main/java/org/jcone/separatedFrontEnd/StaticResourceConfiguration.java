package org.jcone.separatedFrontEnd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** John 13:34-35
 * (Love)
 * A new command I give you: 
 * Love one another. 
 * As I have loved you, so you must love one another. 
 * By this everyone will know that you are my disciples, if you love one another. 
 */
@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
	
	/** 1 John 3:18
		(Love)
		Dear children, let us not love with words or speech but with actions and in truth.
	*/
	@Value("${spring.thymeleaf.prefix}")
	private String thymeleafTemplatePath;
	
	/** 1 Peter 5:5-6
		(Humility)
		In the same way, you who are younger, submit yourselves to your elders.
		All of you, clothe yourselves with humility toward one another, because, 'God opp​oses the proud but shows favor to the humble.'
		Humble yourselves, therefore, under God's mighty hand, that he may lift you up in due time.
	*/
	@Value("${node_modules.path}")
	private String nodeModulesPath;
	
	/** Philippians 2:3-4
		(Humility)
		Do nothing out of selfish ambition or vain conceit.
		Rather, in humility value others above yourselves, not looking to your own interests but each of you to the interests of the others.
	*/
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
