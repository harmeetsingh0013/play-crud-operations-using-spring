/**
 * 
 */
package com.harmeetsingh13.custannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import play.mvc.With;

import com.harmeetsingh13.interceptors.LoggerInterceptor;

/**
 * @author james
 *
 */

/** The interceptors we can also user as a custom annotations or put @with() annotation direct on action */
@With(value = {LoggerInterceptor.class})
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggerAnnotation {
	boolean send() default true;
}
