package za.ac.cput;

import java.util.*;

public class Map {
    public static void main(String[] args) {

        HashMap<Integer, String> Planet = new HashMap<>();

            Planet.put(1,"Mercury");
            Planet.put(2, "Venus");
            Planet.put(3, "Earth");
            Planet.put(4, "Mars");
            Planet.put(5, "Jupiter");
            Planet.put(6, "Saturn");
            Planet.put(7, "Uranus");
            Planet.put(8, "Neptune");

        Planet.put(9, "Pluto");
        Planet.remove(9);
        Planet.get("Earth");
    }
}