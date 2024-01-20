package lk.purna.CascadeV2.controller.repository;

import lk.purna.CascadeV2.controller.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
