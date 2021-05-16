package za.ac.cput;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class List {
    public static void main(String[] args) {

        ArrayList Planet = new ArrayList();

            Planet.add("Mercury");
            Planet.add("Venus");
            Planet.add("Earth");
            Planet.add("Mars");
            Planet.add("Jupiter");
            Planet.add("Saturn");
            Planet.add("Uranus");
            Planet.add("Neptune");

        Planet.add(8,"Pluto");
        Planet.remove(7);
        assertTrue( Planet.contains("Earth") );
    }
}
