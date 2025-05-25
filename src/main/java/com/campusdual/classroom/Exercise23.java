package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static void main(String[] args) {
        Map<String, Person> citizens = createHashMap();
        printMapValues(citizens);
        addMapValue(citizens, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(citizens);
    }

    public static Map<String, Person> createHashMap() {

        Map<String, Person> citizens = new HashMap<>();
        citizens.put("person", new Person("John", "Smith"));
        citizens.put("teacher",new Teacher("María", "Montessori", "Educación"));
        citizens.put("police",new PoliceOfficer("Jake", "Peralta", "B-99"));
        citizens.put("doctor",new Doctor("Gregory","House","Nefrología e infectología"));
        return citizens;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }


    public static void printMapValues(Map<String, Person> map) {

        for (Map.Entry<String, Person> entry : map.entrySet()){
            entry.getValue().getDetails();
            System.out.println("---------------------------------------");
        }

    }

}
