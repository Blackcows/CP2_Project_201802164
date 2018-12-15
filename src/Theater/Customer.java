package Theater;

import java.io.Serializable;

public class Customer implements Serializable {
	private String id; // ���̵�
	private String pw; // ��й�ȣ
	private String name; // �̸�
	private String number; // �ֹε�Ϲ�ȣ
	private String email; // �̸���

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
