package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Request;
import com.app.dto.Response;

@RestController
public class ExamController {

	@PostMapping("/bfhl")
	public Response exam(@RequestBody Request req)
	{
		Response resp=new Response();
		int p=0,q=0;
		String[] obj=req.getAlphabets();
		String[]  alphabets=new String[obj.length];
		int[] num=new int[obj.length];
		
		for(int i=0;i<obj.length;i++) {
			//System.out.println("coming in for loop");
			if(Character.isLetter(obj[i].charAt(0))) {	
				//System.out.println(obj[i].charAt(0));
				alphabets[p++]=obj[i];
			}else {
				num[q++]=Integer.parseInt(obj[i]);
			}
		}
		
		 resp.setEmailID("kunal21d2112@mail.com");
		 resp.setCollegeRollNumber("PD1235");
		 resp.setUserID("kunal_deshmukh_27051997");
		 resp.setStatus(true);
		 resp.setArrayForAlphabets(alphabets);
		 resp.setArrayForNumbers(num);
		 return resp;
	}
	
}
