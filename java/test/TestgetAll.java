/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dao.BookDao;
import dao.BookDaoImpl;
import java.util.List;
import model.Book;
/**
 *
 * @author safev
 */
public class TestgetAll {
    public static void main(String[] args) {
        BookDao dao = new BookDaoImpl();
        List<Book> books = dao.getAll();
        
        for (Book b : books) {
            System.out.println("Id: "+b.getId());
            System.out.println("NameB: "+b.getTitle());
            System.out.println("Au: "+b.getAuthors());
            System.out.println("Image: "+b.getImageName());
            System.out.println("price: "+b.getPrice());
            if (b.getStatus()==1) {
                System.out.println("TAM");
            }else{
                System.out.println("Nao TAM");
            }
            System.out.println("_____________________");
        }
    }
}
