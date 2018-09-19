package org.jcone.separatedFrontEnd;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 1 Peter 2:11
	(Purity)
	Dear friends, I urge you, as foreigners and exiles, to abstain from sinful desires, which wage war against your soul.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * Ephesians 5:3
		(Purity)
		But among you there must not be even a hint of sexual immorality, or of any kind of impurity, or of greed, because these are improper for God's holy people.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppsApplication.class);
	}

}
