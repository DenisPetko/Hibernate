package service.impl;

import HibernateSessionFactoryUtil.HibernateSessionFactoryUtil;
import model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.CityDao;

public class CityDaoImpl implements CityDao {
    private final String user = "postgres";
    private final String password = "DenP7641";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public void addCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
    }
}
