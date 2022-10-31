/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Janhvi Shah
 */
public class Community {
    private String community;
    private City city;

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String communityName) {
        this.community = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    @Override
    public String toString(){
        return community;
    }
}
