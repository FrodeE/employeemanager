package git.frodee.employeemanager.service;

import git.frodee.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findEmployeeById(Long id);

    List<Employee> findAllEmployees();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
