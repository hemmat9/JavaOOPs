package com.syntax.Practice;

import java.util.ArrayList;

public class VehicleTester {
    public static void main(String[] args) {
        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle());
        vehicles.add(new Car());
        vehicles.add(new BMW());

        for (Vehicle veh: vehicles
             ) { veh.name();


        }

    }
}
