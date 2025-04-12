package business.dao;
import business.model.Employee;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean softDeleteEmployee(String employeeCode) {
        return false;
    }

    @Override
    public Employee getByCode(String employeeCode) {
        return null;
    }

    @Override
    public List<Employee> getAll(int page, int size) {
        return List.of();
    }

    @Override
    public List<Employee> searchByName(String name) {
        return List.of();
    }

    @Override
    public List<Employee> searchByAgeRange(int minAge, int maxAge) {
        return List.of();
    }

    @Override
    public List<Employee> sortBySalaryDesc() {
        return List.of();
    }

    @Override
    public List<Employee> sortByNameAsc() {
        return List.of();
    }

    @Override
    public int countAllEmployees() {
        return 0;
    }

    @Override
    public int countEmployeesByDepartment(int departmentId) {
        return 0;
    }
}