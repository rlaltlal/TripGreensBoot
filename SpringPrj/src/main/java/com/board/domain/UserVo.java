package com.board.domain;

public class UserVo {
	private String id;
	private String name;
	private String email;
	private String passwd;
	private String authority;
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public UserVo(String id, String name, String email, String passwd, String authority) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.authority = authority;
	}
	
	
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", email=" + email + ", passwd=" + passwd + ", authority="
				+ authority + "]";
	}
	public UserVo() {}
}
