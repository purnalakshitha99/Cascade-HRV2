package lk.purna.CascadeV2.controller.repository;

import lk.purna.CascadeV2.controller.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
