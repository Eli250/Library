package eli.auca.model;
// Generated May 15, 2020 12:56:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private String bookId;
     private Bookcategory bookcategory;
     private String title;
     private String publishingHouse;
     private Date dateOfPublication;
     private String author;
     private int pages;

    public Book() {
    }

    public Book(String bookId, Bookcategory bookcategory, String title, String publishingHouse, Date dateOfPublication, String author, int pages) {
       this.bookId = bookId;
       this.bookcategory = bookcategory;
       this.title = title;
       this.publishingHouse = publishingHouse;
       this.dateOfPublication = dateOfPublication;
       this.author = author;
       this.pages = pages;
    }
   
    public String getBookId() {
        return this.bookId;
    }
    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public Bookcategory getBookcategory() {
        return this.bookcategory;
    }
    
    public void setBookcategory(Bookcategory bookcategory) {
        this.bookcategory = bookcategory;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishingHouse() {
        return this.publishingHouse;
    }
    
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public Date getDateOfPublication() {
        return this.dateOfPublication;
    }
    
    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return this.pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }




}


