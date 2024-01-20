package lk.purna.CascadeV2.service.impl;

import lk.purna.CascadeV2.controller.model.Department;
import lk.purna.CascadeV2.controller.model.Dependent;
import lk.purna.CascadeV2.controller.model.Employee;
import lk.purna.CascadeV2.controller.repository.DepartmentRepository;
import lk.purna.CascadeV2.controller.repository.DependentRepository;
import lk.purna.CascadeV2.controller.repository.EmployeeRepository;
import lk.purna.CascadeV2.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private DependentRepository dependentRepository;


    public void create(){
        System.out.println("service impl");
    }


    public void saveDepartment(){

        Department department = new Department();
        Department department1 = new Department();
        Department department2 = new Department();

        department.setName("HR");
        department1.setName("ICT");
        department2.setName("BM");

        departmentRepository.save(department);
        departmentRepository.save(department1);
        departmentRepository.save(department2);

    }

    public void addEmployeeDepartment(){

        Department department = new Department();

        department.setId(2L);



        Employee employee = new Employee();

        employee.setName("yasiru");
        employee.getDepartmentList().add(department);   //department list eka aragena eka athulata ara ewapup departmnet eke id eka denwa set krnn yana depaartment eka //eka api udin gaththe udin gaththa kiynne ekata thama setkaare hard cord karala id ekk 1L kiyl //1L kiyana department ekata employeewa set karnna ynne me

        employeeRepository.save(employee);
    }


    public void addEmployeeDepartment2(Long depId){

        Optional<Department>departmentOptional = departmentRepository.findById(depId);

        if (departmentOptional.isPresent()){
            System.out.println("have");

            Department department = departmentOptional.get();

            Employee employee = new Employee();

            employee.setName("sriyani");
            employee.getDepartmentList().add(department);



            employeeRepository.save(employee);
        }else {
            System.out.println("not having that id");
        }


    }

    public void addDependentForEmployee(){



        Dependent dependent1 = new Dependent();
        Dependent dependent2 = new Dependent();

//        dependent1.setName("ekanyakaD");
        dependent2.setName("sidath");


        Employee employee = new Employee();

        employee.setName("wanithaM");




//        employee.getDependentList().add(dependent1);  //methana me wenne dn dependenet list kiyl thiyena list eka aran ekata thama me dependent wa add karanne //list ekakata dpendent la wa add krnne(dependentList.add(department) //me wenuwata emp.setDepartmentList() gaththoth wenne ara thiyena list eka ayin wela aluth list ekkma ena eka..

        employee.getDependentList().add(dependent2)   //me karala thiyenne ara kalin list ekatama thawa dependent kenek add karala
        ;

        dependent2.setEmployee(employee);


        employeeRepository.save(employee);





    }


}
