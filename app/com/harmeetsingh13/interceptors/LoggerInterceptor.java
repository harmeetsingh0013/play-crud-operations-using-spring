/**
 * 
 */
package com.harmeetsingh13.interceptors;

import javax.inject.Named;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.SimpleResult;

import com.harmeetsingh13.custannotations.LoggerAnnotation;

/**
 * @author james
 *
 */
@Singleton
@Named("loggerInterceptor")
public class LoggerInterceptor extends Action<LoggerAnnotation>{

	private Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Override
	public Promise<SimpleResult> call(Context ctx) throws Throwable {
		if(configuration.send()){
			logger.info("Email send successfully");
		}else{
			logger.info("Email command cancel");
		}
		return delegate.call(ctx);
	}

}
