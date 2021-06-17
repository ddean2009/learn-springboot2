package com.flydean.controller;

import com.flydean.entity.Book;
import com.flydean.model.BookModel;
import com.flydean.repository.BookRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class BookController {

	@Resource
	private BookRepository bookRepository;

	@RequestMapping("/book/{id}")
	public HttpEntity<Book> getBook(@PathVariable("id") Long id) {
		Book book= bookRepository.findById(id).get();
		BookModel bookModel = new BookModel(book);
		bookModel.add(linkTo(methodOn(BookController.class).getBook(id)).withSelfRel());
		return new ResponseEntity(bookModel, HttpStatus.OK);
	}
}
