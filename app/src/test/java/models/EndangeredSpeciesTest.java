package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredSpeciesTest {
    @Test
    public void testGetsNameOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals("Bear", newEndangeredSpecies.getEndangeredSpeciesName());
    }

    @Test public void testGetsLocationOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals("Forest", newEndangeredSpecies.getEndangeredLocation());
    }

    @Test public void testGetsHealthOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( "okay", newEndangeredSpecies.getEndangeredHealth());
    }

    @Test public void testGetsAgeOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( "young", newEndangeredSpecies.getEndangeredAge());
    }

    @Test public void testGetsIdOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( 1, newEndangeredSpecies.getId());
    }

    @Test public void testGetsInstancesOfNewRanger(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertTrue(EndangeredSpecies.getInstances().contains(newEndangeredSpecies));
    }
}