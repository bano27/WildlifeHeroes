package models;

import org.junit.Test;

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

    @Test public void testGetsInstancesOfNewAnimal(){
        Animal newAnimal = Animal.newSecuredAnimal();
        assertTrue(Animal.getInstances().contains(newAnimal));
    }
}