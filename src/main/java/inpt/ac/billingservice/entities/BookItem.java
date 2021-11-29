package inpt.ac.billingservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class BookItem {
    @Id
    @GeneratedValue
    private Long id;
    private double quantity;
    private double price;
    private long BookID;

    @ManyToOne
    private Bill bill;
    @Transient
    private Book book;

    public BookItem() {
    }

    public BookItem(Long id, double quantity, double price, long BookID, Bill bill, Book book) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.BookID = BookID;
        this.bill = bill;
        this.book = book;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getBookID() {
        return this.BookID;
    }

    public void setBookID(long BookID) {
        this.BookID = BookID;
    }

    public Bill getBill() {
        return this.bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookItem id(Long id) {
        setId(id);
        return this;
    }

    public BookItem quantity(double quantity) {
        setQuantity(quantity);
        return this;
    }

    public BookItem price(double price) {
        setPrice(price);
        return this;
    }

    public BookItem BookID(long BookID) {
        setBookID(BookID);
        return this;
    }

    public BookItem bill(Bill bill) {
        setBill(bill);
        return this;
    }

    public BookItem book(Book book) {
        setBook(book);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", quantity='" + getQuantity() + "'" + ", price='" + getPrice() + "'"
                + ", BookID='" + getBookID() + "'" + ", bill='" + getBill() + "'" + ", book='" + getBook() + "'" + "}";
    }

}
