package git.frodee.employeemanager.service;

import git.frodee.employeemanager.exception.UserNotFoundException;
import git.frodee.employeemanager.model.Employee;
import git.frodee.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    // Autowired is used for bringing in dependencies
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }
}
