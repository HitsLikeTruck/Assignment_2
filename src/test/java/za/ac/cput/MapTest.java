package za.ac.cput;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapTest {
    private HashMap<Integer, String> Planet = new HashMap<>();

    @BeforeEach
    void setUp() {

        Planet.put(1,"Mercury");
        Planet.put(2, "Venus");
        Planet.put(3, "Earth");
        Planet.put(4, "Mars");
        Planet.put(5, "Jupiter");
        Planet.put(6, "Saturn");
        Planet.put(7, "Uranus");
        Planet.put(8, "Neptune");
    }

    @Test
    void addTestCase(){
        Planet.put(9, "Pluto");
        System.out.println("Planet added: \n" + Planet);
    }

    @Test
    void removeTestCase(){
        Planet.remove(9);
        System.out.println("\nPlanet removed: \n" + Planet);
    }

    @Test
    void findTestCase(){
        Planet.get("Earth");
    }


}