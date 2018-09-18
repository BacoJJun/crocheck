package com.humanstar.crocheck.model.engine.dto;

public class rolesVO {
	private int id;
	private String created_at;
	private String updated_at;
	private boolean pharming;
	private boolean warning;
	private boolean domain;
	private boolean email;
	private boolean sms;
	private boolean ntp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public boolean isPharming() {
		return pharming;
	}
	public void setPharming(boolean pharming) {
		this.pharming = pharming;
	}
	public boolean isWarning() {
		return warning;
	}
	public void setWarning(boolean warning) {
		this.warning = warning;
	}
	public boolean isDomain() {
		return domain;
	}
	public void setDomain(boolean domain) {
		this.domain = domain;
	}
	public boolean isEmail() {
		return email;
	}
	public void setEmail(boolean email) {
		this.email = email;
	}
	public boolean isSms() {
		return sms;
	}
	public void setSms(boolean sms) {
		this.sms = sms;
	}
	public boolean isNtp() {
		return ntp;
	}
	public void setNtp(boolean ntp) {
		this.ntp = ntp;
	}
	@Override
	public String toString() {
		return "rolesVO [id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + ", pharming="
				+ pharming + ", warning=" + warning + ", domain=" + domain + ", email=" + email + ", sms=" + sms
				+ ", ntp=" + ntp + "]";
	}
	
	
}
