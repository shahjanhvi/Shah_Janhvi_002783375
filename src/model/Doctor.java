/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Janhvi Shah
 */
public class Doctor extends Person {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public Doctor(String specialization,String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super( name,  age,  gender,  emailId,  phoneNumber,  userName,  password);
        this.specialization = specialization;
    }
    public Doctor(){
    }

    public Object getCommunity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
