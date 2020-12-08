package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangerTest {
    @Test
    public void testGetsNameOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals("Ernest", newRanger.getRangersName());
    }

    @Test public void testGetsGenderOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals("Male", newRanger.getGender());
    }

    @Test public void testGetsAgeOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals( 33, newRanger.getAge());
    }

    @Test public void testGetsIdOfRangerInstance(){
        Ranger newRanger = Ranger.newRangerPost();
        assertEquals( 1, newRanger.getId());
    }

    @Test public void testGetsInstancesOfNewRanger(){
        Ranger newRanger = Ranger.newRangerPost();
        assertTrue(Ranger.getInstances().contains(newRanger));
    }
}