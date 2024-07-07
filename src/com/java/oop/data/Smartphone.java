package com.java.oop.data;

import java.util.Objects;

public class Smartphone extends Laptop implements ReposutoryComputer{

    private String brand;
    private String rilis;

    public Smartphone() {
    }

    public Smartphone(String brand) {
        this.brand = brand;
    }

    public Smartphone(String brand, String rilis) {
        this.brand = brand;
        this.rilis = rilis;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", rilis='" + rilis + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smartphone that = (Smartphone) o;

        if (!Objects.equals(brand, that.brand)) return false;
        return Objects.equals(rilis, that.rilis);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (rilis != null ? rilis.hashCode() : 0);
        return result;
    }

    @Override
    public void spesifikasi() {
        System.out.println(getBrand());
        System.out.println(getFirmware()); // Firmware ini aslinya
        System.out.println(getChipset()); // Chipset ini aslinya
        System.out.println(getSsd());
        System.out.println(getRilis());
        System.out.println(sponsoredAplication());
    }

    @Override
    public String jamanNow() {
        if (this.getRilis().equals("2024")){
            return "Anjay Hp jaman now";
        } else {
            return "Keluaran taun kemaren ya";
        }
    }

    @Override
    public Integer Storage() {
        return getSsd();
    }

    public String sponsoredAplication(){
        return "Tiktik";
    }
}
