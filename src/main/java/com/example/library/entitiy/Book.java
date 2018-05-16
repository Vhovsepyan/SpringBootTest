package com.example.library.entitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "book_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    @JsonBackReference
    private User bookOwner;

    public Book() {
    }

    public Book(String name, User bookOwner) {
        this.name = name;
        this.bookOwner = bookOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(User bookOwner) {
        this.bookOwner = bookOwner;
    }
}
