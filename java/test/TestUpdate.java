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
public class TestUpdate {
    public static void main(String[] args) {
        short status = 0;
        Book b = new Book(4, "sad", "saf", "sad", "saf", 1500, status);
        
        BookDao dao = new BookDaoImpl();
        if (dao.isUpdate(b)) {
            System.out.println("Updated");
        }else{
            System.out.println("nao Update");
        }
    }
}
