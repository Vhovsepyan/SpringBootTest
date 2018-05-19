package com.example.library.entitiy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_login")
    private String nick;

    @Column(name = "user_password")
    private String password;

    @OneToMany(mappedBy = "bookOwner", cascade = CascadeType.ALL)
    @JsonManagedReference
    @OrderBy("id")
    private Set<Book> bookSet;

    public User() {
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.nick = login;
        this.password = password;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
