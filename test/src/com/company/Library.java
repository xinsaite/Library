package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {

     List<Book> SetBook = new ArrayList<>();

    public void AddBook(Book book){
        SetBook.add(book);
        //System.out.println(SetBook);
    }

    public void borrowBook(String isbn){//借書
        for(Book book : SetBook){
            if(book.getIsbn().equals(isbn) && book.quantityInStock != 0){
                System.out.println("書本已成功借出。");
                book.quantityInStock--;
                return;
            }else if(book.getIsbn().equals(isbn) && book.quantityInStock == 0){
                System.out.println("書本目前無庫存。");
                return;
            }

        }
        System.out.println("找不到匹配的書本。");
    }
    public void returnBook(String isbn){//還書
        for(Book book : SetBook){
            if(book.getIsbn().equals(isbn)){
                System.out.println("書本已成功歸還。");
                book.quantityInStock++;
                return;
            }
        }
    }

    public void displayBooks(){
        for (Book book : SetBook) {
            System.out.println(book);
            //.title + SetBook.get(i).author + SetBook.get(i).isbn + SetBook.get(i).publicationYear + SetBook.get(i).quantityInStock
        }
    }
}
