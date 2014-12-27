/**
 * 
 */
package com.harmeetsingh13.interceptors;

import javax.inject.Named;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.libs.F.Promise;
import play.mvc.Action.Simple;
import play.mvc.Http.Context;
import play.mvc.SimpleResult;

/**
 * @author james
 *
 */
@Singleton
@Named(value="exceptionInterceptor")
public class ExceptionInterceptor extends Simple{

	private Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);
	
	@Override
	public Promise<SimpleResult> call(Context ctx) throws Throwable {
		try{
			return delegate.call(ctx);
		}catch(Exception ex){
			logger.info(ex.getMessage());
			return null;
		}
	}

}
