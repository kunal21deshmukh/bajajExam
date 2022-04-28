package com.app.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor 
@Data               
@AllArgsConstructor
public class Response 
{
	private boolean status;
	private String userID;
	private String emailID;
	private String collegeRollNumber;
	private int [] arrayForNumbers;
	private String[] arrayForAlphabets;
	

}
