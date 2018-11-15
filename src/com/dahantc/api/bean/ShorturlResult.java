package com.dahantc.api.bean;

import java.util.List;

public class ShorturlResult {
	private String account;
	private List<ShorturlDetail> shorturlDetails;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public List<ShorturlDetail> getShorturlDetails() {
		return shorturlDetails;
	}
	public void setShorturlDetails(List<ShorturlDetail> shorturlDetails) {
		this.shorturlDetails = shorturlDetails;
	}
	@Override
	public String toString() {
		return "ShorturlPush [account=" + account + ", shorturlDetails=" + shorturlDetails + "]";
	}
}
