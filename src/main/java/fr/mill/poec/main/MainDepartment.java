package fr.mill.poec.main;

import fr.mill.poec.entity.Department;
import fr.mill.poec.entity.Region;
import fr.mill.poec.repository.DepartmentRepository;
import fr.mill.poec.service.Dump;


public class MainDepartment {
    public static void main(String[] args) {
        DepartmentRepository depRep = new DepartmentRepository();
        Region reg = new Region();
//        System.out.println(depRep.findOneBy("region_id",11));
//        System.out.println(depRep.findAll());
        depRep.findDepartmentByRegion(reg);
        //je m'excuse mais je me rappelle plus des findby vu en cours et je ne retrouve plus de support sur lequel m'appuyer
        //je deviennent fou

    }

}

