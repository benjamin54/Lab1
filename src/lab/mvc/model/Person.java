package lab.mvc.model;

import java.io.Serializable;

public class Person implements Serializable{

	public String firstName;
	public String lastName;
	public String birthDay;
	public String sex;
	
	public Person(String firstName, String lastName, String birthDay, String sex){
		firstName ="someone";
		lastName ="someone";
		birthDay ="some date";
		sex = "somesex";
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
