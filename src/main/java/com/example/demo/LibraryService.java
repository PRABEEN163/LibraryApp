package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	
	BookRepo bookRepo;
	MemberRepo memberRepo;
	
	public LibraryService(BookRepo bookRepo, MemberRepo memberRepo) {
		super();
		this.bookRepo = bookRepo;
		this.memberRepo = memberRepo;
	}
	
	public Books addBook(Books books) {
		return bookRepo.save(books);
	}
	public Books viewBook(int bid) {
		return bookRepo.findById(bid).orElse(null);
	}

	public Members addMember(Members members) {
		return memberRepo.save(members);
	}
	public Members viewMembers(int mid) {
		return memberRepo.findById(mid).orElse(null);
	}
	
	
	public List<Books> viewAll() {
		return bookRepo.findAll();
	}
	
	public String deleteBook(int bid) {
		if (bookRepo.existsById(bid)) {
			bookRepo.deleteById(bid);
			return "deletion sucessfully";
		} else {
			return "Book Not Found!";
		}
	}
	
}
