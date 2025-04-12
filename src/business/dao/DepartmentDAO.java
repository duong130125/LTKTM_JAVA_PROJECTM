package business.dao;

import business.model.Department;

import java.util.List;

public interface DepartmentDAO {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(int id);
    Department getById(int id);
    List<Department> getAll(int page, int size);
    List<Department> searchByName(String name);
    boolean isDepartmentHasEmployees(int id);
    Department getDepartmentWithHighestSalary();
    Department getDepartmentWithMostEmployees();
}
