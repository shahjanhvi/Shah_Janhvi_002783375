/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Janhvi Shah
 */
public class CityDirectory {
    private static ArrayList<City> cityDirectory;
    
    public CityDirectory() {
        cityDirectory = new ArrayList<City>();
    }

    public  ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public static void setCityDirectory(ArrayList<City> cityDirectory) {
        CityDirectory.cityDirectory = cityDirectory;
    }

    public static void addCity(City city) {
        cityDirectory.add(city);
    }
    
    
}
