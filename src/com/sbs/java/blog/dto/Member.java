package com.sbs.java.blog.dto;

import java.util.Map;

public class Member extends Dto {
	private String loginId;
	private String loginPw;
	private String name;	
	private String nickname;
	private String email;
	private int level;
	private int mailAuthStatus;
	
	public Member(Map<String, Object> row) {	
		super(row);
		this.loginId = (String)row.get("loginId");
		this.loginPw = (String)row.get("loginPw");
		this.name = (String)row.get("name");
		this.nickname = (String)row.get("nickname");
		this.email = (String)row.get("email");
		this.level = (int)row.get("level");
		this.mailAuthStatus = (int)row.get("mailAuthStatus");
	}
	
	
	
	public int getMailAuthStatus() {
		return mailAuthStatus;
	}


	public void setMailAuthStatus(int mailAuthStatus) {
		this.mailAuthStatus = mailAuthStatus;
	}



	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Member [loginId=" + loginId + ", loginPw=" + loginPw + ", name=" + name + ", nickname=" + nickname
				+ ", email=" + email + "]";
	}	
	
}
