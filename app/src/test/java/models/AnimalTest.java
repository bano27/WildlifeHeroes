package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test public void testGetsNameOfAnimalInstance(){
        Animal newAnimal = Animal.newSecuredAnimal();
        assertEquals("dog", newAnimal.getSpeciesName());
    }

    @Test public void testGetsLocationOfAnimalInstance(){
        Animal newAnimal = Animal.newSecuredAnimal();
        assertEquals("Shoreline", newAnimal.getLocation());
    }

    @Test public void testGetsIdOfNewAnimalInstance(){
        Animal newAnimal = Animal.newSecuredAnimal();
        assertEquals( 1, newAnimal.getId());
    }

    @Test public void testsSaveInstanceOfAnimal(){
        Animal newAnimal = Animal.newSecuredAnimal();
        newAnimal.save();
        assertTrue(Animal.all().get(0).equals(newAnimal));
    }

    @Test public void testsDeleteInstanceOfAnimal(){
        Animal newAnimal = Animal.newSecuredAnimal();
        newAnimal.save();
        int animalId = newAnimal.getId();
        newAnimal.delete();
        assertEquals(null, Animal.all().get(animalId));
    }

    @Before
    public void setUp() throws Exception {
        DB.sql2o = new Sql2o("jdbc:postgresql://ec2-35-169-184-61.compute-1.amazonaws.com:5432/dc7m9s2sra11c1", "aybfxjapoxbaeg", "866a8d849157dce317cd8842de2599053befb3425ed20fd714b1d7285efd5368");
    }

    @After
    public void tearDown() throws Exception {
        try(Connection con = DB.sql2o.open()) {
            String sqlAnimal = "DELETE FROM animals *;";
            con.createQuery(sqlAnimal).executeUpdate();
        }
    }

}