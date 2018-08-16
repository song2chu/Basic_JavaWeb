/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Book;
import db.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author safev
 */
public class BookDaoImpl extends Database implements BookDao {

    @Override
    public List<Book> getAll() {
        List<Book> bookList = new ArrayList<Book>();
        String sql = "select * from book order by id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Book b = new Book();
                b.setId(result.getInt("id"));
                b.setTitle(result.getString("title"));
                b.setAuthors(result.getString("authors"));
                b.setImageName(result.getString("imageName"));
                b.setPrice(result.getInt("price"));
                b.setStatus(result.getShort("status"));
                bookList.add(b);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public boolean isInsert(Book book) {
        boolean result = false;
        String sql = "insert into book (title,authors,imageName,detail,price,status)"
                + " values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthors());
            ps.setString(3, book.getImageName());
            ps.setString(4, book.getDetail());
            ps.setInt(5, book.getPrice());
            ps.setShort(6, book.getStatus());

            int record = ps.executeUpdate();
            if (record >= 0) {
                result = true;
            } else {
                result = false;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean isUpdate(Book book) {
        boolean result = false;
        String sql = "update book set title=?, authors=?, ImageName=?, detail=?, price=?, status=?"
                + " where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthors());
            ps.setString(3, book.getImageName());
            ps.setString(4, book.getDetail());
            ps.setInt(5, book.getPrice());
            ps.setShort(6, book.getStatus());
            ps.setInt(7, book.getId());

            int record = ps.executeUpdate();
            if (record >= 1) {
                result = true;
            } else {
                result = false;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean isDelete(int id) {
        boolean result = false;
        String sql = "delete from book where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int record = ps.executeUpdate();
            if (record >= 1) {
                result = true;
            } else {
                result = false;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Book getById(int id) {
        Book book = new Book();
        String sql = "select * from book where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                book.setId(result.getInt("id"));
                book.setTitle(result.getString("title"));
                book.setImageName(result.getString("imageName"));
                book.setDetail(result.getString("detail"));
                book.setPrice(result.getInt("price"));
                book.setStatus(result.getShort("status"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public List<Book> getBykeyword(String keyword) {
        List<Book> bookList = new ArrayList<Book>();
        String sql = "select * from book where title like ? or authors like ? "
                + " or detail like ? "
                + "order by id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, keyword);
            ps.setString(2, keyword);
            ps.setString(3, keyword);
            ResultSet result =ps.executeQuery();
            while (result.next()) {                
                Book b =new Book();
                b.setId(result.getInt("id"));
                b.setTitle(result.getString("title"));
                b.setAuthors(result.getString("authors"));
                b.setImageName(result.getString("imageName"));
                b.setPrice(result.getInt("price"));
                b.setStatus(result.getShort("status"));
                bookList.add(b);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

}
