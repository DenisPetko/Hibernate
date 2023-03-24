import model.City;
import model.Employee;
import service.CityDao;
import service.EmployeeDAO;
import service.impl.CityDaoImpl;
import service.impl.EmployeeDAOImpl;


public class Application {
    public static void main(String[] args){

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDao cityDao = new CityDaoImpl();

//        Работает:
        City newCity = new City(30, "Рязань");
        cityDao.addCity(newCity);

//        Работает:
        Employee E1 = new Employee("Фил", "Хит", "М", 50, newCity);
        employeeDAO.addEmployee(E1);

//        Работает:
        System.out.println(employeeDAO.getEmployeeByID(6));

//        Рботает:
        for (Employee employee : employeeDAO.getAllEmployees()) {
            System.out.println(employee);
        }

//        Работает:
        Employee E2 = new Employee("Den", "Pekto", "M", 30);
        employeeDAO.updateEmployeeById(E2);

//        Работает
        employeeDAO.deleteEmployee(E2);
    }
}


