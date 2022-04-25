package com.two.swaggertwo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Details about the Student ")
public class Student {
	@ApiModelProperty(notes=" Roll number of the student")
	private String id;
	@ApiModelProperty(notes=" name of the student")
	private String name;
	@ApiModelProperty(notes=" Phone number  of the student")
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
