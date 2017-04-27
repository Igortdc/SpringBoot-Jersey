package com.example.controller;

import com.google.gson.annotations.SerializedName;

/**
 * @author igortc
 * @since 27 de abr de 2017
 *
 */
public class Employee {

	@SerializedName("EmpId")
	private String empId;

	@SerializedName("Name")
	private String name;

	/**
	 * @return String
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}