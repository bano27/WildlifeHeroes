package models;

import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.List;

public class EndangeredSpecies implements interfaces.EndangeredSpecies {
    private String endangeredSpeciesName;
    private String endangeredLocation;
    private String endangeredAge;
    private String endangeredHealth;
    private int id;
    private static List<EndangeredSpecies> instances = new ArrayList<>();

    public EndangeredSpecies(String endangeredSpeciesName, String endangeredLocation, String endangeredAge, String endangeredHealth){
        this.endangeredSpeciesName = endangeredSpeciesName;
        this.endangeredLocation = endangeredLocation;
        this.endangeredAge = endangeredAge;
        this.endangeredHealth = endangeredHealth;
        this.id = instances.size();
        instances.add(this);
    }

    public String getEndangeredSpeciesName() {
        return endangeredSpeciesName;
    }

    public String getEndangeredLocation() {
        return endangeredLocation;
    }

    public String getEndangeredAge() {
        return endangeredAge;
    }

    public String getEndangeredHealth() {
        return endangeredHealth;
    }

    public int getId() {
        return id;
    }

    public static List<EndangeredSpecies> getInstances() {
        return instances;
    }

    @Override
    public void saveEndangered() {
        String sql = "INSERT INTO animals (endangeredSpeciesName,endangeredLocation,endangeredAge,endangeredHealth) VALUES(:endangeredSpeciesName,:endangeredLocation,:endangeredAge,:endangeredHealth)";
        try(Connection con = DB.sql2o.open()) {
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("endangeredSpeciesName", this.endangeredSpeciesName)
                    .addParameter("endangeredLocation", this.endangeredLocation)
                    .addParameter("endangeredAge", this.endangeredAge)
                    .addParameter("endangeredHealth", this.endangeredHealth)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }

    }

    public static EndangeredSpecies newEndangeredPost(){
        return new EndangeredSpecies("Bear", "Forest", "young", "okay");
    }
}
