package com.validator;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Validator;

public class RegistrationBean {
	String name, surname, phone, email;
	
	

	public RegistrationBean(String name, String surname, String phone, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
	}
	
	public boolean validate(RegistrationBean user, ActionRequest request) {
		boolean flag = true;
		if(!Validator.isName(user.getName())) {
			flag=false;
			SessionErrors.add(request, "firstname.errorMsg.missing");
		}
		
		if(!Validator.isName(user.getSurname())) {
			flag=false;
			SessionErrors.add(request, "surname.errorMsg.missing");
		}
		
		if(!Validator.isPhoneNumber(user.getPhone())) {
			flag=false;
			SessionErrors.add(request, "phonenumber.errorMsg.missing");
		}
		
		if(!Validator.isEmailAddress(user.getEmail())) {
			flag=false;
			SessionErrors.add(request,  "email.errorMsg.missing");
		}
		
		
		
		return flag;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
