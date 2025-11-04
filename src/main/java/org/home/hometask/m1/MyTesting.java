package org.home.hometask.m1;

import java.util.*;

public class MyTesting {
    public static void main(String[] args) {
//        ***ArrayList
//        CustomArrayList list = new CustomArrayList();
//        CustomArrayList list2 = new CustomArrayList();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list2.add(5);
//        list2.add(6);
//        list2.add(7);
//        list.addAll(list2.getArray());
//        System.out.println(Arrays.toString(list.getArray()));
//
//        list.remove(1);
//        list.remove(11);
//        System.out.println(Arrays.toString(list.getArray()));

//        ***HashSet

//        CustomHashSet<Integer> set = new CustomHashSet<>();
//        System.out.println(set);
//        System.out.println(set.map);
//        System.out.println(set.add(1));
//        System.out.println(set.add(2));
//        System.out.println(set.add(1));
//        System.out.println(set.map.get(1));
//        System.out.println(set.map.size());
//        System.out.println(set.map.get(2));


        List<Book> books = Arrays.asList(
                new Book("Java", 2007, 230)
                , new Book("Python", 2010, 350)
                , new Book("C#", 2000, 560)
                , new Book("JavaScript", 2015, 130)
                , new Book("TypeScript", 2020, 290)
                , new Book("Ruby", 2011, 101)
                , new Book("C++", 1994, 670)
                , new Book("C", 1992, 764)
                , new Book("Assembler", 1983, 1001)
                );

        List<Student> students = Arrays.asList(
                new Student("Ivan")
                , new Student("Pert")
                , new Student("Max")
                , new Student("Oliver")
                , new Student("Mark")
                , new Student("Alex")
        );

        System.out.println("students");
        students.stream().peek(student -> {})
                .forEach(student -> {
                    student.addBookStudent(Book.getRandomBook(books, 5));
                    System.out.println(student);
                });
        System.out.println("books");
        books.stream().peek(book -> {})
                .forEach(book -> {
                    System.out.println(book);
                });

        System.out.println("books sorted");
        books.stream().peek(book -> {})
                .sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()))
                .forEach(book -> System.out.println(book));

        System.out.println("years > 2000");
        books.stream().peek(book -> {})
                .filter(book -> book.getYear() > 2000)
                .forEach(book -> {
                    System.out.println(book);
                });

        System.out.println("limitStream");
        students.stream().peek(student -> {})
                .limit(3)
                .forEach(student -> {System.out.println(student);});

        System.out.println("yearBooks");
        books.stream().peek(book -> {})
                .forEach(book -> System.out.println(book.getYear()));

        System.out.println("Optional");
        System.out.println(books.stream().peek(book -> {})
                .filter(b -> b.getTitle() != null && !b.getTitle().isEmpty())
                .findFirst());

        Optional<Book> foundBook = books.stream()
                .filter(book -> book.getTitle().equals("Java"))  // Фильтр по названию
                .findFirst();

        foundBook.ifPresentOrElse(
                book -> System.out.println("year '" + book.getTitle() + "': " + book.getYear()),
                () -> System.out.println("not find book")
        );


//        HashSet<Book> bookSet = new HashSet<>(books);
//        Stream<Book> stream = bookSet.stream().sorted();
//
//        bookSet.stream().peek(book -> {})
//                .forEach(book -> System.out.println("Book: " + book));
//
//        students.stream().peek(student -> {})
//                .forEach(student -> System.out.println("Student: " + student));
//        System.out.println(books);



    }
}
