package com.example.project.service;

import com.example.project.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {
    private RestTemplate restTemplate;
    @Autowired
    public EmployeeService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }
    public String savaEmployee(Employee employee){

        HttpEntity<Employee> entity = new HttpEntity<>(employee);
        return restTemplate.exchange("https://dummy.restapiexample.com/api/v1/employees", HttpMethod.GET, entity,String.class).getBody();
    }

}
