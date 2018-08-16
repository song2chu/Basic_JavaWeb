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
public class TestDelete {
    public static void main(String[] args) {
        BookDao dao = new BookDaoImpl();
        if (dao.isDelete(5)) {
            System.out.println("Deleted!");
        }else{
            System.out.println("Nao Deletes");
        }
    }
}
