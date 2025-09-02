package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class LibraryController {
	@Autowired
		LibraryService libraryService;

		public LibraryController(LibraryService libraryService, LibraryAppApplication libraryAppApplication) {
			super();
			this.libraryService = libraryService;
		}
		
		@PostMapping("/addBook")
		public Books addBook(@RequestBody Books books) {
			return libraryService.addBook(books);
		}
		
		@PostMapping("/addMember")
		public Members addMember(@RequestBody Members members) {
			return libraryService.addMember(members);
		}
		
		@GetMapping("/getBook/{bid}")
		public Books viewBook(@PathVariable int bid) {
			return libraryService.viewBook(bid);
		}
		
		@GetMapping("/getMember/{mid}")
		public Members viewMember(@PathVariable int mid) {
			return libraryService.viewMembers(mid);
		}
		
		@DeleteMapping("/deleteBook")
		public String deleteBooks(@RequestParam("bid") int bid) {
			return libraryService.deleteBook(bid);
		}
		
		@GetMapping("/getAllBook")
		public List<Books> viewAllBook() {
			return libraryService.viewAll();
		}
}
