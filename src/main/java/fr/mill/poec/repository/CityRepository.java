package fr.mill.poec.repository;

import fr.mill.poec.entity.City;
import fr.mill.poec.entity.Department;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CityRepository extends AbstractRepository<City> {
    public CityRepository() {
        super("city");
    }

    @Override
    protected City update(City object) {
        return null;
    }

    @Override
    protected City insert(City object) {
        return null;
    }

    @Override
    protected City getObject(ResultSet rs) {
        City city = new City();
        try {
            city.setId(rs.getLong("id"));
            city.setName(rs.getString("name"));
            city.setSiren(rs.getInt("siren"));
            city.setPopulation(rs.getInt("population"));
            city.setCode(rs.getInt("code"));
        } catch (SQLException e) {
            System.out.println("Something goes wrong while creating a City object : " + e.getMessage());
            city = null;
        }
        return city;
    }
    private City findCitiesByDepartment(Department department){
        return null;
    }
}
