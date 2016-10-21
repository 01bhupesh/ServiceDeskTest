package com.anr.entities;

import javax.persistence.Id;



public class ServiceRequest {
	
	private String selectEnviornment;
	private String severity;
	private String serviceSelector;
	private String startTime;
	private String endTime;
	private String requestTitle;
	private String requestDisc;
	public ServiceRequest() {
	}
	public ServiceRequest(String selectEnviornment, String severity,
			String serviceSelector, String startTime, String endTime,
			String requestTitle, String requestDisc) {
		super();
		this.selectEnviornment = selectEnviornment;
		this.severity = severity;
		this.serviceSelector = serviceSelector;
		this.startTime = startTime;
		this.endTime = endTime;
		this.requestTitle = requestTitle;
		this.requestDisc = requestDisc;
	}

	public String getSelectEnviornment() {
		return selectEnviornment;
	}
	public void setSelectEnviornment(String selectEnviornment) {
		this.selectEnviornment = selectEnviornment;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getServiceSelector() {
		return serviceSelector;
	}
	public void setServiceSelector(String serviceSelector) {
		this.serviceSelector = serviceSelector;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRequestTitle() {
		return requestTitle;
	}
	public void setRequestTitle(String requestTitle) {
		this.requestTitle = requestTitle;
	}
	public String getRequestDisc() {
		return requestDisc;
	}
	public void setRequestDisc(String requestDisc) {
		this.requestDisc = requestDisc;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((requestTitle == null) ? 0 : requestTitle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceRequest other = (ServiceRequest) obj;
		if (requestTitle == null) {
			if (other.requestTitle != null)
				return false;
		} else if (!requestTitle.equals(other.requestTitle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return
		this.selectEnviornment+"\n"+
		this.severity+"\n"+
		this.serviceSelector+"\n"+
		this.startTime+"\n"+
		this.endTime+"\n"+
		this.requestTitle+"\n"+
		this.requestDisc;
	}
	
}
