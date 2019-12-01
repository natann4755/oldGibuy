package com.company.Library;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList <Book> books=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            books.add(Book.Add());
        }
        print();
        for (int i = 0; i <20 ; i++) {
            System.out.println(books.get(i));
        }
    }
    public static void print(){
        System.out.println(Book.Numbooks +" books in library");
        int nnn = Book.Numbooks-Book.NumInlibrary;
        System.out.println(nnn+ " books in library new");
    }
}
