/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import model.Book;
import dao.BookDao;
import dao.BookDaoImpl;
/**
 *
 * @author safev
 */
public class TestGetById {
    public static void main(String[] args) {
        BookDao dao = new BookDaoImpl();
        Book book = dao.getById(1);
        System.out.println("Detail: "+book.toString());
    }
}
