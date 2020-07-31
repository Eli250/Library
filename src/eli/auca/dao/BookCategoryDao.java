/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eli.auca.dao;

import eli.auca.model.Bookcategory;
import eli.auca.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eli-PC
 */
public class BookCategoryDao {
    Session session = null;
    public void addBookCategory(Bookcategory category){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(category);
        tx.commit();
        session.close();
    }
    
    public void updateBookcategory(Bookcategory category) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(category);
        tx.commit();
        session.close();
    }

    public void deleteBookcategory(Bookcategory category) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(category);
        tx.commit();
        session.close();
    }

    public List<Bookcategory> displayBookcategory() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Bookcategory> categories = (List<Bookcategory>) session.createCriteria(Bookcategory.class).list();
        tx.commit();
        session.close();
        return categories;
    }

    public List<Bookcategory> findByCategoryId(String bookId) {

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Bookcategory> categories = (List<Bookcategory>) session.createCriteria(Bookcategory.class).add(Restrictions.eq("categoryid", bookId)).list();
        tx.commit();
        session.close();
        return categories;
    }

    public String getCategoryName(String bookId) {
        String sql = "select categoryName from Bookcategory where categoryID = '" + bookId + "'";
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object name = session.createQuery(sql).uniqueResult();
        tx.commit();
        session.close();
        return name.toString();
    }

    public String getCategoryId(String name) {
        String sql = "SELECT categoryID FROM bookcategory WHERE categoryName = '" + name + "'";
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createQuery(sql);
        tx.commit();
        session.close();
        return id.toString();
    }

    public List<String> getCategoryNames() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<String> names = session.createCriteria(Bookcategory.class).setProjection(Projections.property("categoryName")).list();
        tx.commit();
        session.close();
        return names;
    }
    
}
