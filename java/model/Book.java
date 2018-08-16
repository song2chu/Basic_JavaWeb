/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author safev
 */
public class Book {
    private int id;
    private String title;
    private String authors;
    private String imageName;
    private String detail;
    private int price;
    private short status;
    
    public Book(){}

    public Book(String title, String authors, String imageName, String detail, int price, short status) {
        this.title = title;
        this.authors = authors;
        this.imageName = imageName;
        this.detail = detail;
        this.price = price;
        this.status = status;
    }

    public Book(int id, String title, String authors, String imageName, String detail, int price, short status) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.imageName = imageName;
        this.detail = detail;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", authors=" + authors + ", imageName=" + imageName + ", detail=" + detail + ", price=" + price + ", status=" + status + '}';
    }
    
    
}
