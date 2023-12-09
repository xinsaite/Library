package com.company;

public class Book {
    public String title;
    public String author;
    private final String isbn;
    public int publicationYear;
    public int quantityInStock;

    Book(String t, String a, String i, int pby, int qui){
        title = t;
        author = a;
        isbn = i;
        publicationYear = pby;
        quantityInStock = qui;

    }

    public String toString() {
        return "Book{" +
                "書名='" + title + '\'' +
                ", 作者='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", 出版年份=" + publicationYear +
                ", 庫存數量=" + quantityInStock +
                '}';
    }
    public String getIsbn(){
        return isbn;
    }

}
