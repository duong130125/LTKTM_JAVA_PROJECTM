package business.dao;

import business.model.Department;

import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
    @Override
    public boolean addDepartment(Department department) {
        return false;
    }

    @Override
    public boolean updateDepartment(Department department) {
        return false;
    }

    @Override
    public boolean deleteDepartment(int id) {
        return false;
    }

    @Override
    public Department getById(int id) {
        return null;
    }

    @Override
    public List<Department> getAll(int page, int size) {
        return List.of();
    }

    @Override
    public List<Department> searchByName(String name) {
        return List.of();
    }

    @Override
    public boolean isDepartmentHasEmployees(int id) {
        return false;
    }

    @Override
    public Department getDepartmentWithHighestSalary() {
        return null;
    }

    @Override
    public Department getDepartmentWithMostEmployees() {
        return null;
    }
}
