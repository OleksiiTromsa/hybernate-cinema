package com.dev.cinema.dao.impl;

import com.dev.cinema.dao.CinemaHallDao;
import com.dev.cinema.lib.Dao;
import com.dev.cinema.model.CinemaHall;
import com.dev.cinema.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

@Dao
public class CinemaHallDaoImpl extends GenericDaoImpl<CinemaHall>
        implements CinemaHallDao {
    @Override
    public List<CinemaHall> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from CinemaHall ", CinemaHall.class).getResultList();
        }
    }
}
