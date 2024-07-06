package com.java.oop.app;

import com.java.oop.data.*;

public class MotorApp {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.sparepart = "Sparepart yang saling berhubungan";
        motor.machineComponent("bensin Pertamina");


        motor = new Gearbox();
        motor.sparepart = "SealKlep";
        motor.oli = "oli Enduro";
        motor.machineComponent("Piston");


        motor = new Carbulator();
        motor.sparepart = "SealSkep";
        motor.machineComponent("Mainjet");

        /*
        Type check and cast bisa menggunakan instaceof
         */
        if (motor instanceof Carbulator){
            Motor sparepart = new Gearbox();
            System.out.println("ini termasuk komponen motor");
        } else if (motor instanceof Carbulator) {
            System.out.println("Objek penting agar motor bisa berjalan");
        } else {
            System.out.println("Yukk jos ngeng");
        }
    }
}
