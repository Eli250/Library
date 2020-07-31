/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eli.auca.dao;

import eli.auca.model.Account;
import eli.auca.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Eli-PC
 */
public class SignupDao {

    public void insert(Account account) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(account);
        tx.commit();
        session.close();
    }

    public void retrieveData() {
        Account account1 = new Account();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        account1 = (Account)session.load(Account.class, "eli");
        String pass = account1.getUsername();
        
        

        JOptionPane.showMessageDialog(null, pass);
        tx.commit();
        session.close();
        
    }
}
