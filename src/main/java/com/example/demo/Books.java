package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	@Column
	String title;
	@Column
	String author;
	@Column
	String available;
	@ManyToOne
	@JoinColumn(name="memberid")
	Members members;
	
	public Books() {
		super();
	}

	public Books(String title, String author, String available, Members members) {
		super();
		this.title = title;
		this.author = author;
		this.available = available;
		this.members = members;
	}

	public Books(int bookid, String title, String author, String available, Members members) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.available = available;
		this.members = members;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}
	
}
