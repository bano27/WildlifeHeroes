package models;

import java.util.ArrayList;
import java.util.List;

public class EndangeredSpecies {
    private String endangeredSpeciesName;
    private String endangeredLocation;
    private String endangeredAge;
    private String endangeredHealth;
    private int id;
    private static List<EndangeredSpecies> instances = new ArrayList<>();

    public Animal(String endangeredSpeciesName, String endangeredLocation, String endangeredAge, String endangeredHealth, Integer id){
        this.endangeredSpeciesName = endangeredSpeciesName;
        this.endangeredLocation = endangeredLocation;
        this.endangeredAge = endangeredAge;
        this.endangeredHealth = endangeredHealth;
        this.id = instances.size();
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
}
