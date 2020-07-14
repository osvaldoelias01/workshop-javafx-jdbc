package model.services;

import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Direcção"));
        list.add(new Department(2, "Recursos Humanos"));
        list.add(new Department(3, "Administrativo"));
        list.add(new Department(4, "Fábrica de SoftWare"));

        return list;
    }
}
