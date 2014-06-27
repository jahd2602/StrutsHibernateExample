/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

public abstract class AbstractFacade<T> {

    private Class<T> entityClass;
    private EntityManager em;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void createEdit(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        beginTransaction.commit();
        session.close();
    }

    public void remove(T entity) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction beginTransaction = session.beginTransaction();
        session.delete(entity);
        beginTransaction.commit();
        session.close();
    }

    public T find(Object id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Object get = session.get(entityClass, (Serializable) id);
        session.close();
        return (T) get;
    }

    public List<T> findAll() {
        Session openSession = HibernateUtil.getSessionFactory().openSession();
        List<T> get = openSession.createCriteria(entityClass).list();
        openSession.close();
        return get;
    }

    public List<T> findRange(int[] range) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(entityClass);
        criteria.setMaxResults(range[1] - range[0] + 1);
        criteria.setFirstResult(range[0]);
        List list = criteria.list();
        session.close();
        return list;
    }

    public int count() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return ((Long) session.createCriteria(entityClass).setProjection(Projections.rowCount()).uniqueResult()).intValue();
    }

}
