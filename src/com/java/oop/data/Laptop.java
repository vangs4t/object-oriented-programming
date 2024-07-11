package com.java.oop.data;

public class Laptop extends Computers{
    private ProductElektronik product = new ProductElektronik("Lazada");
    private String chipset;
    private String firmware;

    public Laptop(String iniCasing, String iniMotherboard, String chipset, String firmware) {
        super(iniCasing, iniMotherboard);
        this.chipset = chipset;
        this.firmware = firmware;
    }

    public Laptop(){

    }
    public String getChipset() {
        if (chipset != null){
            return chipset;
        } else {
            return null;
        }
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public final void namaStore(){
        System.out.println(product.seller);
    }
}
