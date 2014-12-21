/**
 * 
 */
package com.harmeetsingh13.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import play.Application;
import play.GlobalSettings;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class GlobalConfiguration /*extends GlobalSettings*/{

	/*private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
	
	@Override
	public void onStart(Application app) {
		super.onStart(app);
		
		// AnnotationConfigApplicationContext can only be refreshed once, but we do it here even though this method
		// can be called multiple times. The reason for doing during startup is so that the Play configuration is
		// entirely available to this application context.
		applicationContext.scan("com.harmeetsingh13");
		applicationContext.refresh();
		
		// This will construct the beans and call any construction lifecycle methods e.g. @PostConstruct
		applicationContext.start();
	}
	
	@Override
	public void onStop(Application app) {
		// This will call any destruction lifecycle methods and then release the beans e.g. @PreDestroy
		applicationContext.close();
		
		super.onStop(app);
	}
	
	@Override
	public <A> A getControllerInstance(Class<A> clazz) throws Exception {
		return applicationContext.getBean(clazz);
	}*/
}
