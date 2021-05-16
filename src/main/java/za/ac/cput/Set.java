package za.ac.cput;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Set {
    public static void main(String[] args) {

        HashSet<String> Planet = new HashSet<>();

            Planet.add("Mercury");
            Planet.add("Venus");
            Planet.add("Earth");
            Planet.add("Mars");
            Planet.add("Jupiter");
            Planet.add("Saturn");
            Planet.add("Uranus");
            Planet.add("Neptune");

        Planet.add("Pluto");
        Planet.remove("Pluto");
        assertTrue( Planet.contains("Earth") );
    }
}
