package models;

import java.util.ArrayList;
import java.util.List;

public class Ranger {
    private String rangersName;
    private String gender;
    private int age;
    private int id;
    private static List<Ranger> instances = new ArrayList<>();

    public Ranger(String rangersName, String gender, Integer age){
        this.rangersName = rangersName;
        this.gender = gender;
        this.age = age;
        this.id = instances.size();
        instances.add(this);
    }

    public String getRangersName() {
        return rangersName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public static List<Ranger> getInstances() {
        return instances;
    }

    public static Ranger newRangerPost(){
        return new Ranger("Ernest", "Male", 33);
    }
}
