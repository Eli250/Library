/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eli.auca.dao;

import eli.auca.model.Client;
import eli.auca.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eli-PC
 */
public class ClientDao {

    Session session = null;

    public void saveClient(Client client) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(client);
        tx.commit();
        session.close();
    }

    public void updateClient(Client client) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(client);
        tx.commit();
        session.close();
    }

    public void deleteClient(Client client) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(client);
        tx.commit();
        session.close();
    }
    public List<Client> displayClient(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Client> client = (List<Client>)session.createCriteria(Client.class).list();
        tx.commit();
        session.close();
        return client;
    }
  public List<Client> findByCLientId(String id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Client> clients = (List<Client>) session.createCriteria(Client.class).add(Restrictions.eq("regno", id)).list();
        tx.commit();
        session.close();
        return clients;
    }

    public String getRegno(String name) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createQuery("select regno from Client where firstname||' '||lastname ='" + name + "'").uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }

    public String getClientName(String regno) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createQuery("select firstname||' '||lastname as name from Client where regno ='" + regno + "'").uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }
        
}
