package com.EM2.SpringMVCFormApplication.validation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import com.EM2.SpringMVCFormApplication.validationImpl.HobbyValidator;


@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface isHobbyValid {
	String message() default "Please provide a valid hobby!"+
				"accepted hobbies are: music, football, cricket and hockey.";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
}
