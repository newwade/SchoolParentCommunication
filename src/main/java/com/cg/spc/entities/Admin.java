package com.cg.spc.entities;

import javax.persistence.*;

@Entity(name = "ADMIN_1")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADMIN_USER_ID")
	private int userId;

	@Column(name = "ADMIN_USER_NAME")
	private String adminName;

	@Column(name = "ADMIN_PASSWORD")
	private String password;

	@Column(name = "ADMIN_CONTACT")
	private String adminContact;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param userId
	 * @param adminName
	 * @param password
	 * @param adminContact
	 */
	public Admin(int userId, String adminName, String password, String adminContact) {
		super();
		this.userId = userId;
		this.adminName = adminName;
		this.password = password;
		this.adminContact = adminContact;
	}

	public Admin() {
		super();
	}

}
