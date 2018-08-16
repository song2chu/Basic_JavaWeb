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
public class TestInsert {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("SAFE1");
        b.setAuthors("SAFE1");
        b.setImageName("SAFE1");
        b.setDetail("SAFE1");
        b.setPrice(4);
        short status = 0;
        b.setStatus(status);
        
        BookDao dao = new BookDaoImpl();
        boolean result = dao.isInsert(b);
        if (result) {
            System.out.println("Recorded! ");
        }else{
            System.out.println("Can't Recorded");
        }
    }
}
