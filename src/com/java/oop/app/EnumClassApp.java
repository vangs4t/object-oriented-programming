package com.java.oop.app;


import com.java.oop.data.EnumClass;
import com.java.oop.data.Level;

public class EnumClassApp {
    public static void main(String[] args) {
        Level level = new Level();
        level.setName("Ninja Heroes");
        level.setaClass(EnumClass.VIP);

        System.out.println(level.getName());
        System.out.println(level.getaClass());
        System.out.println(level.getaClass().getInfo());

        System.out.println(EnumClass.valueOf("PREMIUM"));
        System.out.println("values");
        for (var value : EnumClass.values()){
            System.out.println(value);
        }
    }
}
