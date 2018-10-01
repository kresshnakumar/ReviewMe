package com.workOMeter.ReviewMe.Responses;

public class LoginResponse {
	private String status;
	private String userId;
	private String designation;
	private String dateOfJoining;
	private String name;
	private String createdDate;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "LoginResponse [status=" + status + ", userId=" + userId + ", designation=" + designation
				+ ", dateOfJoining=" + dateOfJoining + ", name=" + name + ", createdDate=" + createdDate + "]";
	}

}
