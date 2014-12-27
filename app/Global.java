/**
 * 
 */


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import play.Application;
import play.GlobalSettings;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class Global extends GlobalSettings{

	private Logger logger = null;	
	private final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
	
	public Global() {
		logger = Logger.getLogger("GlobalConfiguration");
		logger.setLevel(Level.ALL);
	}
	
	@Override 
	public void onStart(Application app) {
		super.onStart(app);
		
		// AnnotationConfigApplicationContext can only be refreshed once, but we do it here even though this method
		// can be called multiple times. The reason for doing during startup is so that the Play configuration is
		// entirely available to this application context.
		logger.info("ON START");
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
		logger.info("getControllerInstance");
		return applicationContext.getBean(clazz);
	}
}
