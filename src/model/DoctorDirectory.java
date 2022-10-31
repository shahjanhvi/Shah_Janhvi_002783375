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
public class DoctorDirectory {
    private static ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        doctorDirectory = new ArrayList<Doctor>();
    }

    public static ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public static void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        DoctorDirectory.doctorDirectory = doctorDirectory;
    }

    public static void addDoctor(Doctor doctor) {
        doctorDirectory.add(doctor);
    }
   
    public boolean authenticateDoctor(String username, String password) {
        Doctor user = doctorDirectory.stream().filter(l -> l.getUsername().equals(username) && l.getPassword().equals(password)).findFirst().orElse(null);
        boolean found = user == null ? false : true;
        return found;
        
    }
    
    public Doctor searchDoctorByDoctorID(int doctorID) {
        for(Doctor d : doctorDirectory) {
            if(d.getPersonID()== doctorID){
                return d;
            }
        }
        return null;
    }
    
    public Doctor searchDoctor(String parameter, String value) {
    switch(parameter){
            case "Doctor ID":
                for(Doctor e: doctorDirectory){
                    if(e.getPersonID() == Integer.parseInt(value)){
                        return e;
                    }
                }
                break;
            case "First Name":
                for(Doctor e: doctorDirectory){
                    if(e.getFirstName().equals(value)){
                        return e;
                    }
                }
                break;
            case "Username":
                for(Doctor e: doctorDirectory){
                    if(e.getUsername().equals(value)){
                        return e;
                    }
                }
            default:
                    return null;
        }
        return null;
    }

    public void deleteDoctor(Doctor d) {
        doctorDirectory.remove(d);
    }

    public Doctor searchDoctorByFirstName(String firstName) {
        for(Doctor d : doctorDirectory) {
            if(d.getFirstName().equals(firstName)){
                return d;
            }
        }
        return null;
    }
}
