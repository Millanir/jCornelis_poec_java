package fr.mill.poec.main;

import fr.mill.poec.entity.Department;
import fr.mill.poec.repository.DepartmentRepository;


public class MainDepartment {
    public static void main(String[] args) {
        DepartmentRepository depRep = new DepartmentRepository();
        System.out.println(depRep.findOneBy("region_id",11));


    }

}

