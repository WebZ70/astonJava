package org.home.hometask.m2;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;

public class WRFile {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\projects\\java\\LJ\\src\\main\\java\\org\\home\\hometask\\m2\\file.txt")) {
            fileOutputStream.write("Hi, Tim!".getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }

            Files.write(Paths.get("D:\\projects\\java\\LJ\\src\\main\\java\\org\\home\\hometask\\m2\\file.txt"), "Hello, Tim. Method write #2.\n".getBytes(), StandardOpenOption.TRUNCATE_EXISTING);

//        try (FileInputStream fileInputStream = new FileInputStream(new File("file.txt"))) {
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
