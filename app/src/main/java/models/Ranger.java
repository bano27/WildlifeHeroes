package models;

import interfaces.RangerInterface;
import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.List;

public class Ranger implements RangerInterface {
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

    @Override
    public void save() {
        String sql = "INSERT INTO rangers (rangersName,gender,age) VALUES(:rangersName,:gender,:age)";
        try(Connection con = DB.sql2o.open()) {
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("rangersName", this.rangersName)
                    .addParameter("gender", this.gender)
                    .addParameter("age", this.age)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }

    }

    public void delete() {
        try(Connection con = DB.sql2o.open()){
            String sql = "DELETE FROM rangers WHERE id = :id;";
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public static Ranger newRangerPost(){
        return new Ranger("Ernest", "Male", 33);
    }
}
