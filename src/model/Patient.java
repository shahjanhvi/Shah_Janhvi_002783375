/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Janhvi Shah
 */
public class Patient extends Person {
    private String ill;
    
    

    public String getill() {
        return ill;
    }

    /**
     *
     * @param ill
     */
    public void setill(String ill) {
        this.ill = ill;
    }
    
    /**
     *
     *
     * @param ill
     * @param name
     * @param age
     * @param gender
     * @param emailId
     * @param phoneNumber
     * @param userName
     * @param password
     */
    public Patient(String ill,String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super( name,  age,  gender,  emailId,  phoneNumber,  userName,  password);
        this.ill = ill;
    }
     public Patient() {
    }
   
     @Override
    public String toString() {
        return "Patient{" + "ill=" + ill+ '}';
    }
}
