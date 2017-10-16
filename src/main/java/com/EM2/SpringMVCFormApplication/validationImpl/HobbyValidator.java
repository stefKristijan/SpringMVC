package com.EM2.SpringMVCFormApplication.validationImpl;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.EM2.SpringMVCFormApplication.validation.isHobbyValid;

public class HobbyValidator implements ConstraintValidator<isHobbyValid,String>{

	@Override
	public void initialize(isHobbyValid constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value==null) {
			return false;
		}
		else if(value.matches("music|football|cricket|hockey")){
			return true;
		}else {
			return false;
		}
	}

	

}
