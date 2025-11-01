package org.home.hometask;


import java.util.*;

public class Student {
    private String name;
    private final HashSet<Book> listBooks;

    Student(String name) {
        this.name = name;
        this.listBooks = new HashSet<>();;
    }

    public void addBookStudent(Collection<Book> book) {
//        listBooks.add(book);
        listBooks.addAll(book);
    }

    public void addBookStudent(Book book) {
        listBooks.add(book);
//        listBooks.addAll(book);
    }

    @Override
    public String toString() {
        return "name: " + name + ", books: " + listBooks;
    }
}
