package models;

//import interfaces.AnimalInterface;

import interfaces.AnimalInterface;
import org.sql2o.Connection;

import java.util.List;

public class Animal implements AnimalInterface {
    private String speciesName;
    private String location;
    private int id;
    private static final String endangered = "endangered";

    public Animal(String speciesName, String location) {
        this.speciesName = speciesName;
        this.location = location;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public static Animal newSecuredAnimal() {
        return new Animal("dog", "Shoreline");
    }

    @Override
    public void save(){
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (speciesName,endangered) VALUES (:speciesName,:endangered)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("speciesName", this.speciesName)
                    .addParameter("endangered", this.endangered)
                    .executeUpdate()
                    .getKey();
        }
    }

    @Override
    public void update(String speciesName){
        String sql = "UPDATE animals SET speciesName=:speciesName WHERE id=:id";
        try (Connection conn = DB.sql2o.open()) {
            conn.createQuery(sql)
                    .addParameter("speciesName", speciesName)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    @Override
    public void delete(){
        try (Connection conn = DB.sql2o.open()){
            String sql = "DELETE FROM animals WHERE id=:id;";
            conn.createQuery(sql)
                    .addParameter("id",id)
                    .executeUpdate();
        }
    }

    public static List<Animal> all(){
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).throwOnMappingFailure(false).executeAndFetch(Animal.class);
        }
    }
}
