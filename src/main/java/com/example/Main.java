package com.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter w = new PrintWriter("output/index.html", "UTF-8")) {
            w.println("<h1>Hello from Java CI/CD!</h1>");
            System.out.println("HTML generado correctamente.");
            w.println("<h1>Hello from Java CI/CD!</h1>");
            w.println("<p><a href=\"checkstyle.html\">Ver reporte Checkstyle</a></p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}