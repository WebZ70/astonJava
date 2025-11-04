package org.home.hometask.m1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private int pages;

    Book(String title, int year, int pages) {
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public static List<Book> getRandomBook(List<Book> book, int size){
        if(book.size() < size){
            return book;
        }
        HashSet<Book> bookSet = new HashSet<Book>();
        while (bookSet.size() != size) {
            bookSet.add(book.get(new SecureRandom().nextInt(book.size())));
        }
        return new ArrayList<>(bookSet);
    }

    @Override
    public String toString() {
        return "{title: " + title + ", " +
                "year: " + year + ", " +
                "pages: " + pages + "}";
    }
}
