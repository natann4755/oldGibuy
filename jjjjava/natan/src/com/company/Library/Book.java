package com.company.Library;

import java.util.Random;
import java.util.Scanner;

public class Book {
    String nameBook;
    String nameAuothor;
    int pages;
    boolean InLibrary;

    static int Numbooks;//מס ספרים במאגר
    static int NumInlibrary;//// מספר ספרים בספריה שאינם שאולים


    public boolean isInLibrary() {
        return InLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        InLibrary = inLibrary;
        if (InLibrary)
        Book.NumInlibrary++;
    }

    public Book(String nameBook, String nameAuothor) {
        this.nameBook = nameBook;
        this.nameAuothor = nameAuothor;
        Random random=new Random();
        this.pages=random.nextInt(400);
    }
    public static Book Add() {
        Book.Numbooks++;
        String mm = msg("Write the book's name");
        String nn = msg("Write the author's name");
        Book b = new Book(mm, nn);
        if (Numbooks > 0) {
            if (NumInlibrary / Numbooks - NumInlibrary < 2) {
                b.InLibrary = true;
            }
            if (NumInlibrary / Numbooks - NumInlibrary > 2) {
                b.InLibrary = false;
            } else {
                Random random = new Random();
                b.setInLibrary(random.nextBoolean());
            }

        }
        return b;
    }

    public static String msg (String m){
        Scanner scan=new Scanner(System.in);
        System.out.println(m);
        return scan.nextLine();

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("nameBook='").append(nameBook).append('\'');
        sb.append(", nameAuothor='").append(nameAuothor).append('\'');
        sb.append(", pages=").append(pages);
        sb.append(", InLibrary=").append(InLibrary);
        sb.append('}');
        return sb.toString();
    }
}
