package com.interview.controller;

import java.util.List;
import com.interview.ArrayList;
import com.interview.Autowired;
import com.interview.Book;
import com.interview.BookNotFoundException;
import com.interview.BookRepository;
import com.interview.GetMapping;
import com.interview.PathVariable;
import com.interview.PostMapping;
import com.interview.RequestBody;
import com.interview.RequestMapping;

@Controller
public class BookController {
	//List<Book> findAll();
	//Book findById(int id);
	//Book add(Book b);

			@Autowired
			BookRepository repo;
			
			
			@RequestMapping(value="/books", method=RequestMehtod.GET)
			public List<Book> findAll(){
				List<Book> books = new ArrayList<>();
				repo.findAll().forEach(books-> books+" ");
				return books;
			}
			
			@GetMapping("/books/{id}")
			public Book findById(@PathVariable (id) int id) {
				repo.findById(id).orElseThrow(new BookNotFoundException -> System.out.println("Book by " + id + " Is not available" ));
				return id;
			}
			
			@PostMapping(path="/books")
			public void add(@RequestBody Book b) {
				repo.save(b);
			}
	 

}
