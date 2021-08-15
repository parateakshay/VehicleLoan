package com.vehicleloan.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin 
{
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HB_ADMIN_SEQ")
	@SequenceGenerator(name = "HB_ADMIN_SEQ",sequenceName = "adminid_seq",allocationSize=1)
	@Column(name = "admin_id")
	@Id
	private int adminId;
	@Column(name = "admin_name")
	private String adminName;
	@Column(name = "admin_email")
	private String adminEmail;
	@Column(name = "admin_password")
	private String adminPassword;
	@Column(name = "admin_phnumber")
	private Long adminPhone;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Long getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(Long adminPhone) {
		this.adminPhone = adminPhone;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + ", adminPhone=" + adminPhone + "]";
	}
	
	
}
