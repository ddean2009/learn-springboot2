package com.flydean.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flydean.entity.Book;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author wayne
 * @version BookModel,  2021/6/17
 */
public class BookModel extends RepresentationModel<BookModel> {

    private final Book content;

    @JsonCreator
    public BookModel(@JsonProperty("content") Book content) {
        this.content = content;
    }

    public Book getContent() {
        return content;
    }
}
