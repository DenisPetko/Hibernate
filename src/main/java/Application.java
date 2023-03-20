import model.Employee;
import service.EmployeeDAO;
import service.impl.EmployeeDAOImpl;


public class Application {
    public static void main(String[] args){

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

//        Работает:
//        Employee E1 = new Employee("Денис", "Денисов", "М", 30, 1);
//        employeeDAO.addEmployee(E1);

//        Работает:
//        System.out.println(employeeDAO.getEmployeeByID(6));

//        Не Работает т к в таблице есть null вместо города
        for (Employee employee : employeeDAO.getAllEmployees()) {
            System.out.println(employee);
        }

//        Работает:
//        Employee E2 = new Employee(37, "Денис", "Петко", "М", 40, 2);
//        employeeDAO.updateEmployeeById(E2);

//        Работает
//        employeeDAO.deleteEmployee(E2);
    }
}
