package business.dao;

import business.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean softDeleteEmployee(String employeeCode);
    Employee getByCode(String employeeCode);
    List<Employee> getAll(int page, int size);
    List<Employee> searchByName(String name);
    List<Employee> searchByAgeRange(int minAge, int maxAge);
    List<Employee> sortBySalaryDesc();
    List<Employee> sortByNameAsc();
    int countAllEmployees();
    int countEmployeesByDepartment(int departmentId);
}
