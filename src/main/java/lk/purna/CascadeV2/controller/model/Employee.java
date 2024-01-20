package lk.purna.CascadeV2.controller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinTable(name = "employee_department",joinColumns = @JoinColumn(name = "employee_id"),inverseJoinColumns = @JoinColumn(name = "department_id"))
    @ManyToMany
    private List<Department>departmentList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Dependent>dependentList = new ArrayList<>();
}
