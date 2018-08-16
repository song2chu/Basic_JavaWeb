/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.List;
import model.Book;
/**
 *
 * @author safev
 */
public class TestBook {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        short status = 1;
        Book b1 = new Book(1, "a1", "a1", "a1", "a1", 10, status);
        Book b2 = new Book(2, "a2", "a2", "a2", "a2", 20, status);
        Book b3 = new Book(3, "a3", "a3", "a3", "a3", 30, status);
        
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        
        System.out.println("Book ALL IS: "+bookList.size());
        for (Book b : bookList) {
            System.out.println("Detail Book: "+b.toString());
            
        }
    }
}
