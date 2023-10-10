/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Document;

/**
 *
 * @author Admin
 */
public class Document {
    protected String nameOfDoc;
    protected String author;
    protected int yearOfPublication;
    protected double price;

    public Document(String nameOfDoc, String author, int yearOfPublication, double price) {
        this.nameOfDoc = nameOfDoc;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public String getNameOfDoc() {
        return nameOfDoc;
    }

    public void setNameOfDoc(String nameOfDoc) {
        this.nameOfDoc = nameOfDoc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Document{" + "nameOfDoc=" + nameOfDoc + ", author=" + author + ", yearOfPublication=" + yearOfPublication + ", price=" + price + '}';
    }
    
    
    
}
