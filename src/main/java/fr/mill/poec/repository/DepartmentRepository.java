package fr.mill.poec.repository;

import fr.mill.poec.entity.City;
import fr.mill.poec.entity.Department;
import fr.mill.poec.entity.Region;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRepository extends AbstractRepository<Department> {
    public DepartmentRepository() {
        super("department");
    }

    @Override
    protected Department update(Department object) {
        return null;
    }

    @Override
    protected Department insert(Department object) {
        return null;
    }

    @Override
    protected Department getObject(ResultSet rs) {
        Department department = new Department();
        try {
            department.setId(rs.getLong("id"));
            department.setName(rs.getString("name"));
            department.setRegionId(rs.getInt("region_id"));
            department.setCode(rs.getString("code"));
        } catch (SQLException e) {
            System.out.println("Something goes wrong while creating a Department object : " + e.getMessage());
            department = null;
        }
        return department;

    }

    private static void findDepartmentByRegion(){

    }
//    private static void findDepartmentByRegion(Region region) {
//        int regionID = region.getId();
//        System.out.println(regionID);
//
//    }
//    private Department findDepartmentByRegion(Region region) {
//        try {
//            String query = "SELECT * FROM `department` WHERE `region_id` = ?; ";
//            PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setInt(1, region.getId());
//            stmt.executeQuery();
//        } catch (SQLException e) {
//            System.out.println("Something went wrong during update of a Category : " + e.getMessage());
//        }
//        return null;
//    }
}