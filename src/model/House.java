/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Janhvi Shah
 */
public class House extends Community{
     private int houseNumber;
     private String streetName;
  


    public int getHouseName() {
        return houseNumber;
    }

    public void setHouseName(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

 public House(String streetName, int houseNumber, String communityName, String cityName) {
        super(communityName, cityName);
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Object getHouseNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

