package com.dhruv.springform.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNamePrefixConstarintValidator implements ConstraintValidator<UserNamePrefix, String>  {

	private String userNamePrefix;
	
	public void initialize(UserNamePrefix usernamePrefix) {
		userNamePrefix = usernamePrefix.value();
	}
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
		
		if(username != null) {
			result = username.startsWith(userNamePrefix);
		} 
		else {
			result = true;
		}
		
		
		
		return result;
	}

}
