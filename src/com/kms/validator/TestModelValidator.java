package com.kms.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kms.model.TestModel;

public class TestModelValidator implements Validator {
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		if(TestModel.class.isAssignableFrom(arg0)){
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		// TODO Auto-generated method stub
		System.out.println("validation");
		TestModel testModel = (TestModel)arg0;
		
		
		if(testModel.getName() == null || testModel.getName().length() == 0){
			errors.rejectValue("name", "required");
		}
	}
}
