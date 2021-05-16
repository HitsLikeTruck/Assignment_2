package za.ac.cput;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTest {
    private ArrayList Planet = new ArrayList();

    @BeforeEach
    void setUp() {

       Planet.add("Mercury");
       Planet.add("Venus");
       Planet.add("Earth");
       Planet.add("Mars");
       Planet.add("Jupiter");
       Planet.add("Saturn");
       Planet.add("Uranus");
       Planet.add("Neptune");
    }

    @Test
    void addTestCase(){
        Planet.add(8,"Pluto");
        System.out.println("Planet added: \n" + Planet);
    }

    @Test
    void removeTestCase(){
        Planet.remove(7);
        System.out.println("\nPlanet removed: \n" + Planet);
    }

    @Test
    void findTestCase(){
        assertTrue( Planet.contains("Earth") );
    }

}

















