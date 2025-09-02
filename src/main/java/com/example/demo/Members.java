package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Members {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int memberid;
	@Column
	String membername;
	@Column
	String memberemail;
	@Column
	String memberphone;
	
	public Members() {
		super();
	}
	
	public Members(String membername, String memberemail, String memberphone) {
		super();
		this.membername = membername;
		this.memberemail = memberemail;
		this.memberphone = memberphone;
	}
	
	public Members(int memberid, String membername, String memberemail, String memberphone) {
		super();
		this.memberid = memberid;
		this.membername = membername;
		this.memberemail = memberemail;
		this.memberphone = memberphone;
	}
	
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	
}
