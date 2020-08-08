package com.dhruv.springform;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.dhruv.springform.validation.UserNamePrefix;

public class Customer {

	@NotNull(message="is Required")
	@Size(min=1, max=12, message="Size must be greater than 1 and less than 32")
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1, max=12, message="Size must be greater than 1 and less than 32")
	private String lastName;
	
	@Min(value=0, message="Customer must be born.")
	@Max(value=120, message="Customer should be younger.")
	@NotNull
	private Integer age;
	
	@Pattern(regexp="^(.+)@(.+)$", message="Invalid Email Form")
	@NotNull
	private String email;
	
	private String gender;
	
	@NotNull
	@UserNamePrefix(value="GrihSeva", message="Must start with GrihSeva")
	private String userName;
	
	private String State;
	
	@Pattern(regexp="^[0-9]{6}", message="Postal Code must be of 6 Digit")
	@NotNull
	private String postalCode;
	
	private String favouriteCity;
	
	private LinkedHashMap<String, String> stateOptions;
	
	public Customer() {
		
		stateOptions = new LinkedHashMap<>();
		
		stateOptions.put("Andhra Pradesh", "Andhra Pradesh");
		stateOptions.put("Arunachal Pradesh", "Arunachal Pradesh");
		stateOptions.put("Assam", "Assam");
		stateOptions.put("Bihar", "Bihar");
		stateOptions.put("Chandigarh", "Chandigarh");
		stateOptions.put("Chhattisgarh", "Chhattisgarh");
		stateOptions.put("Dadra and Nagar Haveli and Daman and Diu", "Dadra and Nagar Haveli and Daman and Diu");
		stateOptions.put("Delhi", "Delhi");
		stateOptions.put("Goa", "Goa");
		stateOptions.put("Gujarat", "Gujarat");
		stateOptions.put("Haryana", "Haryana");
		stateOptions.put("Himachal Pradesh", "Himachal Pradesh");
		stateOptions.put("Jammu and Kashmir", "Jammu and Kashmir");
		stateOptions.put("Jharkhand", "Jharkhand");
		stateOptions.put("Karnataka", "Karnataka");
		stateOptions.put("Kerala", "Kerala");
		stateOptions.put("Ladakh", "Ladakh");
		stateOptions.put("Lakshadweep", "Lakshadweep");
		stateOptions.put("Madhya Pradesh", "Madhya Pradesh");
		stateOptions.put("Maharashtra", "Maharashtra");
		stateOptions.put("Manipur", "Manipur");
		stateOptions.put("Meghalaya", "Meghalaya");
		stateOptions.put("Mizoram", "Mizoram");
		stateOptions.put("Nagaland", "Nagaland");
		stateOptions.put("Odisha", "Odisha");
		stateOptions.put("Puducherry", "Puducherry");
		stateOptions.put("Punjab", "Punjab");
		stateOptions.put("Rajasthan", "Rajasthan");
		stateOptions.put("Sikkim", "Sikkim");
		stateOptions.put("Tamil Nadu", "Tamil Nadu");
		stateOptions.put("Telangana", "Telangana");
		stateOptions.put("Tripura", "Tripura");
		stateOptions.put("Uttar Pradesh", "Uttar Pradesh");
		stateOptions.put("Uttarakhand", "Uttarakhand");
		stateOptions.put("West Bengal", "West Bengal");
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFavouriteCity() {
		return favouriteCity;
	}

	public void setFavouriteCity(String favouriteCity) {
		this.favouriteCity = favouriteCity;
	}
	
	public LinkedHashMap<String, String> getStateOptions() {
		return stateOptions;
	}

	public void setStateOptions(LinkedHashMap<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}
	
	
}
