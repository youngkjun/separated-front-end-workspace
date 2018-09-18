package org.jcone.separatedFrontEnd;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * [1 John 3:18]
 * Dear childrean,
 * let us not love with words or speech
 * but with actions and in truth.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * [John 13:34-35]
	 * A new command I give you:
	 * Love one another.
	 * As I have loved you,
	 * so you must love one another.
	 * By this everyone will know
	 * that you are my disciples,
	 * if you love one another.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppsApplication.class);
	}

}
