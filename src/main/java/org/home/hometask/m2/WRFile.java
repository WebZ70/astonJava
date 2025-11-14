package org.home.hometask.m2;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;

public class WRFile {
    public static void main(String[] args) throws CustomException {
//        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\projects\\java\\LJ\\src\\main\\java\\org\\home\\hometask\\m2\\file.txt")) {
//            fileOutputStream.write("Hi, Tim!".getBytes());
//        } catch (IOException e) {
//            System.out.println(e);
//        }

        try {
//            Files.write(Paths.get("src/main/java/org/home/hometask/m2/file.txt"),
//                    "Hello, Tim. Hometask-Write-Read-Files.\n".getBytes(), StandardOpenOption.CREATE);

            byte[] s = Files.readAllBytes(Paths.get("src/main/java/org/home/hometask/m2/file1.txt"));
            System.out.println(new String(s));
        } catch (CustomException e) {
            System.out.println("File not found");
            throw e;
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("IO Exception");
            throw new RuntimeException(e);
        }

//        try (FileInputStream fileInputStream = new FileInputStream(new File("file.txt"))) {
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
