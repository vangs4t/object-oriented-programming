package com.java.oop.data;

public class Gearbox extends Motor{

    public void machineComponent(String gear){
        System.out.println("Di dalam mesin juga terdapat " + gear + " agar motor bisa berjalan. jangan lupa di check " + super.oli + "nya");
    }
}
