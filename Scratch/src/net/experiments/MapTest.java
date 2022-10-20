package net.experiments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapTest {

    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>(); //K: String - V: Double
        gpaMap.put("Veronica", 3.84);
        gpaMap.put("Tanya   ", 3.73);
        gpaMap.put("Tyrone  ", 3.95);
        gpaMap.put("Jyka    ", 3.67);
        gpaMap.put("Jyl     ", 3.41);
        //dump(gpaMap);

        Double jykaGpa = gpaMap.get("Jyka"); //returns the value (Double) next to that key - Autoboxing

        //print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values(); //collection of <V> which is Double here
        for (Double gpa : gpas) {
            if(gpa >= 3.5) {
                System.out.println(gpa);
            }
        }
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 3.0) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void dump(Map<String, Double> map) {
        for (Map.Entry <String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
