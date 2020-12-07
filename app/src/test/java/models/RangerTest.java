package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangerTest {
    @Test
    public void testGetsNameOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals("dog", newRanger.getSpeciesName());
    }

    @Test public void testGetsGenderOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals("Shoreline", newRanger.getGender());
    }

    @Test public void testGetsAgeOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals( 1, newRanger.getAge());
    }

    @Test public void testGetsAgeOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals( 1, newRanger.getId());
    }
}