package com.capgemini.hibernate.dao.impl;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;
import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.util.*;
import com.capgemini.hibernate.*;
public class PersonDAOImpl implements PersonDAO{
    @Override
    public void addNew(Person person){
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session=factory.openSession();
    Transaction tx=session.beginTransaction();
    session.save(person);
    tx.commit();
    factory.close();
}
}

    