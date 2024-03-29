package com.board.domain;

public class UserVo {
	//Fields
	private String email;
	private String nickname;
	private String passwd;
	private String rate;
	private String regdate;
	private String authority;
	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public UserVo(String email, String nickname, String passwd, String rate, String regdate, String authority) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.passwd = passwd;
		this.rate = rate;
		this.regdate = regdate;
		this.authority = authority;
	}
	//Constructor
	public UserVo() {}
	public UserVo(String email, String nickname, String passwd, String rate, String regdate) {
		this.email = email;
		this.nickname = nickname;
		this.passwd = passwd;
		this.rate = rate;
		this.regdate = regdate;
	}

	// Getter & Setter 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "UserVo [email=" + email + ", nickname=" + nickname + ", passwd=" + passwd + ", rate=" + rate
				+ ", regdate=" + regdate + ", authority=" + authority + "]";
	}
	
	
	
	
}
