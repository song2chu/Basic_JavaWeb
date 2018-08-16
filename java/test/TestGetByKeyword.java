/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Book;
import dao.BookDao;
import dao.BookDaoImpl;
import java.util.List;

/**
 *
 * @author safev
 */
public class TestGetByKeyword {

    public static void main(String[] args) {
        BookDao dao = new BookDaoImpl();
        List<Book> bookList = dao.getBykeyword("%dasdad%");

        if (bookList.size() != 0 || bookList != null) {
            for (Book b : bookList) {
                System.out.println("NameB :" + b.getTitle());
                System.out.println("Au: " + b.getAuthors());
                System.out.println("Price: " + b.getPrice());
                System.out.println("_____________");
            }
        } else {
            System.out.println("Can't Find");
        }

    }
}
