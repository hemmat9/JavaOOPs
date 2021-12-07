package com.syntax.polyMorphismPractic;

import com.syntax.class18HomeWork.Teacher;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle[] veh = {new Tesla(), new Toyota()};//polymorphism

        for (Vehicle V : veh) {
            V.stop();
            V.maxSpeed();
            V.start();

            if (V instanceof Tesla) {
                ((Tesla) V).gas();
            }

        }
    }
}