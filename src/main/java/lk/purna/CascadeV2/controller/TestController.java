package lk.purna.CascadeV2.controller;

import lk.purna.CascadeV2.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {

    private TestService testService;

    @PostMapping("/create")
    public void create(){
        System.out.println("crate in test controller");
        testService.create();
    }

//    @PostMapping("/saveDepartments")
//    public void saveDepartment(){
//        System.out.println("save department");
//        testService.saveDepartment();
//    }


    @PostMapping("/addEmployeeDepartment")
    public void addEmployeeDepartment(){
        System.out.println("add employee for department");

        testService.addEmployeeDepartment();
    }


    @PostMapping(value = "/addEmployeeDepartment/{depId}",headers = "version=V2")
    public void addEmployeeDepartment2(@PathVariable("depId")Long depId){
        System.out.println("add emp for dep v2");

        testService.addEmployeeDepartment2(depId);
    }

    @PostMapping("/addDependentForEmployee")
    public void addDependentForEmployee(){
        System.out.println("add dependenet for employee");

        testService.addDependentForEmployee();
    }
}
