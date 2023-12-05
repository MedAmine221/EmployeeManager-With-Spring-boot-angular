package work.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.myproject.model.Employee;

public interface EmployeeRepo extends JpaRepository <Employee, Long>
{

}
