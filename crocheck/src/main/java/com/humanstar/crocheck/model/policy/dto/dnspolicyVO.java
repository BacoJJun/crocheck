package com.humanstar.crocheck.model.policy.dto;

public class dnspolicyVO {

	private int id;
	private String zone;
	private int ttl;
	private String type;
	private String host;
	private int mx_priority;
	private String data;
	private String primary_ns;
	private String resp_contact;
	private int serial;
	private int refresh;
	private int retry;
	private int expire;
	private int minimum;
	private String comment;
	private int modified;
	private int bl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getMx_priority() {
		return mx_priority;
	}
	public void setMx_priority(int mx_priority) {
		this.mx_priority = mx_priority;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPrimary_ns() {
		return primary_ns;
	}
	public void setPrimary_ns(String primary_ns) {
		this.primary_ns = primary_ns;
	}
	public String getResp_contact() {
		return resp_contact;
	}
	public void setResp_contact(String resp_contact) {
		this.resp_contact = resp_contact;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getRefresh() {
		return refresh;
	}
	public void setRefresh(int refresh) {
		this.refresh = refresh;
	}
	public int getRetry() {
		return retry;
	}
	public void setRetry(int retry) {
		this.retry = retry;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getModified() {
		return modified;
	}
	public void setModified(int modified) {
		this.modified = modified;
	}
	public int getBl() {
		return bl;
	}
	public void setBl(int bl) {
		this.bl = bl;
	}
	
	@Override
	public String toString() {
		return "dnspolicyVO [id=" + id + ", zone=" + zone + ", ttl=" + ttl + ", type=" + type + ", host=" + host
				+ ", mx_priority=" + mx_priority + ", data=" + data + ", primary_ns=" + primary_ns + ", resp_contact="
				+ resp_contact + ", serial=" + serial + ", refresh=" + refresh + ", retry=" + retry + ", expire="
				+ expire + ", minimum=" + minimum + ", comment=" + comment + ", modified=" + modified + "]";
	}
	public String csvString() {
		String line = "";
		line += "\"zone\":\"" +zone + "\",";
		line += "\"ttl\":\"" +ttl + "\",";
		line += "\"type\":\"" +type + "\",";
		line += "\"host\":\"" +host + "\",";
		line += "\"mx_priority\":\"" +mx_priority + "\",";
		line += "\"data\":\"" +data + "\",";
		line += "\"primary_ns\":\"" +primary_ns + "\",";
		line += "\"resp_contact\":\"" +resp_contact + "\",";
		line += "\"serial\":\"" +serial + "\",";
		line += "\"refresh\":\"" +refresh + "\",";
		line += "\"retry\":\"" +retry + "\",";
		line += "\"expire\":\"" +expire + "\",";
		line += "\"minimum\":\"" +minimum + "\",";
		line += "\"comment\":\"" +comment + "\",";
		line += "\"modified\":\"" +modified + "\"";
		
		return line;
	}
}
