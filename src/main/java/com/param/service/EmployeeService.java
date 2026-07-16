package com.param.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {

    private final Map<Integer, String> employees = new HashMap<>();

    public EmployeeService() {
        employees.put(1, "Alice");
        employees.put(2, "Bob");
    }

    public String getEmployeeById(int id) {
        return employees.get(id);
    }

    public List<String> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public void addEmployee(int id, String name) {
        employees.put(id, name);
    }

    public void deleteEmployee(int id) {
        employees.remove(id);
    }
}

