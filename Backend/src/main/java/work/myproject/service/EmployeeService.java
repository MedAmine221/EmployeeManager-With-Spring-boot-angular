package work.myproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import work.myproject.exception.UserNotFoundException;
import work.myproject.model.Employee;
import work.myproject.repository.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeService
{
    private final EmployeeRepo employeeRepo;


    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees()
    {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee (Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public void deleteEmployee (Long id)
    {
        employeeRepo.deleteById(id);
    }

    public Employee findEmployeeById(Long id)
    {
        return employeeRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id+ "was not found"));
    }

}
