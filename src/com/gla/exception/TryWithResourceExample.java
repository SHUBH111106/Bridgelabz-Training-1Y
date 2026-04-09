package com.gla.exception;
import java.io.*;

public class TryWithResourceExample {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(br.readLine());
        } catch (java.io.IOException e) {
            System.out.println("Error reading file");
        }
    }
}