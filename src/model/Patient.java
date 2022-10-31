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
public class Patient {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int patientID;
    private int age;
    private String gender;
    private long mobileNo;
//    private Roles role=Roles.Patient;
    //private String emailID;
    private String community;
    private String city;
    private String role;
    private VitalSigns vs;

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
    
    
    //private boolean isNewCase;

    
//    public Patient(String username, String password, String role, String firstName, String lastName, int personID, int age, long mobileNo, String gender, String community, String city) {
//        super(username, password, role, firstName, lastName, personID, age, mobileNo, gender);
//        this.community = community;
//        this.city = city;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

//    public String getEmailID() {
//        return emailID;
//    }
//
//    public void setEmailID(String emailID) {
//        this.emailID = emailID;
//    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString(){
        return String.valueOf(patientID);
    }

    
//   static{
//        Patient p = new Patient();
//        p.setFirstName("drashti");
//        p.setLastName("bhingradiya");
//        p.setAge(22);
//        p.setGender("female");
//        p.setPatientID(10);
//        p.setUserName("drashti");
//        p.setPassword("1234");
////        p.setCommunity("JP");
////        p.setCity("Boston");
//        p.setMobileNo(1234567890);
//   }
}
