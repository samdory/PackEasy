package com.packeasy;

public class MyTripListBean {
	private String uid;
	private String tripName;
	private String tripLocation;
	private String startDate;
	private String endDate;
	private int reminder;
	private int numPackList;
	private boolean valid;

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	public String getTripLocation() {
		return tripLocation;
	}
	public void setTripLocation(String tripLocation) {
		this.tripLocation = tripLocation;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getNumPackList() {
		return numPackList;
	}
	public void setNumPackList(int numPackList) {
		this.numPackList = numPackList;
	}
	public int getReminder() {
		return reminder;
	}
	public void setReminder(int reminder) {
		this.reminder = reminder;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
