package eli.auca.model;
// Generated May 15, 2020 12:56:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bookcategory generated by hbm2java
 */
public class Bookcategory  implements java.io.Serializable {


     private String categoryId;
     private String categoryName;
     private Set books = new HashSet(0);

    public Bookcategory() {
    }

	
    public Bookcategory(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public Bookcategory(String categoryId, String categoryName, Set books) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.books = books;
    }
    public Bookcategory(String categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }




}


