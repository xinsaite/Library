package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0", 1951, 5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", 1960, 3);


        library.AddBook(book1);
        library.AddBook(book2);

        while(true) {

            System.out.println("選擇你想要的功能 (1)新增書籍 (2)列印出所以書籍 (3)借書 (4)還書 (5)離開");
            int s = sc.nextInt();

            switch (s) {
                case 1:
                    Book book = new Book(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());//輸入書本
                    library.AddBook(book);
                    break;
                case 2:
                    System.out.println("Books in the library:");
                    library.displayBooks();//列印所有書籍
                    break;
                case 3:
                    System.out.println("請輸入欲借的書籍的ISBN：");
                    library.borrowBook(sc.next());
                    break;
                case 4:
                    System.out.println("請輸入欲歸還的書籍的ISBN：");
                    library.returnBook(sc.next());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("目前無指定功能");
            }
//        library.borrowBook("978-0-316-76948-0");
//        library.borrowBook("978-0-316-76948-0");
//        library.returnBook("978-0-316-76948-0");
//        library.returnBook("978-0-316-76948-0");
//
//        System.out.println("\nBooks in the library after borrowing and returning:");
//        library.displayBooks();
        }
    }
}
