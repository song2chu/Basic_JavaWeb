/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Book;
import java.util.List;
/**
 *
 * @author safev
 */
public interface BookDao {
    public List<Book> getAll();
    public boolean isInsert(Book book);
    public boolean isUpdate(Book book);
    public boolean isDelete(int id);
    public Book getById(int id);
    public List<Book> getBykeyword(String keyword);
}
