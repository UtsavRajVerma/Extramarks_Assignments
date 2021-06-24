package com.extramarks;

import com.extramarks.dao.FormDao;
import com.extramarks.entity.Form;

public class App {

	
	public static void main(String[] args) {
		
		//for manual testing
		
		Form form = new Form();
		
		form.setName("u3");
		form.setEmail("u3@gm");
		form.setMobile("89898");
		form.setState("u3");
		form.setGender("u3");
		form.setSkills("u3");
		
		
		FormDao formDao = new FormDao();
		
//		formDao(form.getName(),form.getEmail(),form.getMobile(),form.getState(),form.getGender(),form.getSkills());
	
		formDao.saveForm(form);
		
		
		//setter 
		
		//Dao object
		
		//functions check --> db update
		
	}
}
