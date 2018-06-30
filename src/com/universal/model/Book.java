/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.model;

/**
 *
 * @author Lenovo
 */
public class Book {
   int bookId;
    String bookName;
    double bookPrice;


    public Book(int bookId, String bookName, double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;

    }
        @Override
    public String toString() {
        return  "bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice;
    }
}
