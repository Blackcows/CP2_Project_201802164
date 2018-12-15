package Theater;

import java.io.Serializable;

public class Customer implements Serializable {
	private String id; // 아이디
	private String pw; // 비밀번호
	private String name; // 이름
	private String number; // 주민등록번호
	private String email; // 이메일

	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getPW() {
		return pw;
	}
	public void setPW(String pwd) {
		this.pw = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String id, String pw, String name, String number, String email) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.name = name;
		this.number = number;
	}
}
