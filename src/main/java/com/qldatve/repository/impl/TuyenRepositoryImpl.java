/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qldatve.repository.impl;


import com.qldatve.pojos.Tuyen;
import com.qldatve.repository.TuyenRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Repository
public class TuyenRepositoryImpl implements TuyenRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<Tuyen> getTuyen() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("FROM Tuyen");
        
        return q.getResultList();
    }

    @Override
    public Tuyen getTuyenById(int tuyenId) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(Tuyen.class, tuyenId);
    }
}
