package com.java.oop.data;

public class Motor {
    public String sparepart;
    public String oli;
    /*
    Jadi disini kita akan membuat parent dari polimorpisme atau perubahan bentuk object
    dari sebuah motor
     */
    public void machineComponent(String bensin){
        System.out.println("Motor berjalan karena ada " + this.sparepart + " dan juga karena ada " + bensin);
    }
}
