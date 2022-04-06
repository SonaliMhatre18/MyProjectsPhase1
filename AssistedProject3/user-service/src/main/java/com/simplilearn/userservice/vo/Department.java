package com.simplilearn.userservice.vo;

public class Department {
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String deaprtmentCode;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(long departmentId, String departmentName, String departmentAddress, String deaprtmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.deaprtmentCode = deaprtmentCode;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDeaprtmentCode() {
		return deaprtmentCode;
	}

	public void setDeaprtmentCode(String deaprtmentCode) {
		this.deaprtmentCode = deaprtmentCode;
	}

}
