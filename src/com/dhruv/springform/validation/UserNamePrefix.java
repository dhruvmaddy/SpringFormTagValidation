package com.dhruv.springform.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=UserNamePrefixConstarintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface UserNamePrefix {

	//Define Default User Name Prefix
	public String value() default "GrihSeva";
	
	//Define Default Error Message
	public String message() default "Must Start with GrihSeva";
	
	//Define Default Groups
	public Class <?>[] groups() default {};
	
	//Define default payloads
	public Class <? extends Payload>[] payload() default {};
	
}
