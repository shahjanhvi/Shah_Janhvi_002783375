 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import enums.Roles;

/**
 *
 * @author Janhvi Shah
 */
public class Doctor extends Person{
//    private String firstName;
//    private String lastName;
//    private String username;
//    private String password;
//    private int doctorID;
//    private long mobileNo;
//    private String role;
      private String hospital;
//    private int age;

    public Doctor(String username, String password, String role, String firstName, String lastName, int doctorID, int age, long mobileNo, String gender, String hospital) {
        super(username, password, role, firstName, lastName, doctorID, age, mobileNo, gender);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    
    
}
 