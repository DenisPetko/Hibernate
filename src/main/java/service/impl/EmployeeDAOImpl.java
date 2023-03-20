package service.impl;

import HibernateSessionFactoryUtil.HibernateSessionFactoryUtil;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.EmployeeDAO;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private final String user = "postgres";
    private final String password = "DenP7641";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public void addEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) HibernateSessionFactoryUtil
                .getSessionFactory().openSession().createQuery("From Employee ").list();
    }

    @Override
    public void updateEmployeeById(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}


