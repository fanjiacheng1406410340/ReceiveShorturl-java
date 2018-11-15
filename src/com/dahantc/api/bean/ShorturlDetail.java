package com.dahantc.api.bean;

import java.io.Serializable;

public class ShorturlDetail implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 短链接发送任务编号 */
	private String taskid;

	/** 手机号 */
	private String phone;

	/** 源地址 */
	private String url;

	/** 短地址 */
	private String shorturl;

	/** 点击数 */
	private long clicknum;

	/** 时间 yyyy-MM-dd格式 */
	private String wtime;
	/** 操作系统 */
	private String os;
	/** 浏览器 */
	private String browser;
	/** 设备 */
	private String device;
	/** ip */
	private String ip;
	/** 地址有效期 yyyy-MM-dd */
	private String expirydate;

	public String getPhone() {
		return phone;
	}

	public String getUrl() {
		return url;
	}

	public String getShorturl() {
		return shorturl;
	}

	public long getClicknum() {
		return clicknum;
	}

	public String getWtime() {
		return wtime;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}

	public void setClicknum(long clicknum) {
		this.clicknum = clicknum;
	}

	public void setWtime(String wtime) {
		this.wtime = wtime;
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
