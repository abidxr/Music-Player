

import java.lang.*;

public class User{
	String name;
	String password;
	String email;
	String gender;
	String dob;
	
	public User(String name, String password, String email,String gender,String dob){
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}
	
    //Setter
	public void setName(String name){
		this.name = name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setDOB(String dob){
		this.dob = dob;
	}
	
	//Getter
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return email;
	}
	public String getGender(){
		return gender;
	}
	
	public String getDOB(){
		return dob;
	}

}