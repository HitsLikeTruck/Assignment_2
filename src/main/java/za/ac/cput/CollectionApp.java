package za.ac.cput;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> Planet = new Stack<>();

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
        Planet.contains("Earth");

    }
}
