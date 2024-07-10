package com.java.oop.data;

/**
 * Jangan lupa untuk selalu menggunakan getter dan setter
 */
public class Level {
    private String name;
    private EnumClass aClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumClass getaClass() {
        return aClass;
    }

    public void setaClass(EnumClass aClass) {
        this.aClass = aClass;
    }
}
