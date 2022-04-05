package com.example.project.controller;


import com.example.project.dto.Employee;
import com.example.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;
    private String link = "https://dummy.restapiexample.com/api/v1/employees";
    @GetMapping
    public List<Object> getEmployees(){
        Object[] employees = restTemplate.getForObject(link, Object[].class);
        return Arrays.asList(employees);
    }



//

//    private ParseService parseService;
//    @GetMapping("/employees")
//    public Employee getEmployees(@RequestBody Employee employee){
//        return EmployeeService.getALlEmployee(employee);
//    }
//    @GetMapping("/employees/{age}")
//    public Employee getEmployees(@PathVariable int age, @RequestBody Employee employee){
//        return EmployeeService.getEmployeeByAge(age);
//    }

//


}
