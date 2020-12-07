package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredSpeciesTest {
    @Test
    public void testGetsNameOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals("dog", newEndangeredSpecies.getEndangeredSpeciesName());
    }

    @Test public void testGetsLocationOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals("Shoreline", newEndangeredSpecies.getEndangeredLocation());
    }

    @Test public void testGetsHealthOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( 1, newEndangeredSpecies.getEndangeredHealth());
    }

    @Test public void testGetsAgeOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( 1, newEndangeredSpecies.getEndangeredAge());
    }

    @Test public void testGetsIdOfEndangeredSpeciesInstance(){
        EndangeredSpecies newEndangeredSpecies = EndangeredSpecies.newEndangeredPost();
        assertEquals( 1, newEndangeredSpecies.getId());
    }
}