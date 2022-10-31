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
public class PatientDirectory {

    private static ArrayList<Patient> directory;

    public PatientDirectory() {
        directory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Patient> directory) {
        directory = directory;
    }

    public void addNewPatient(Patient p) {
//        Patient newPatient = new Patient();
        directory.add(p);
        //return newPatient;
    }

    public Boolean authenticate(String username, String password) {
//        for(Patient p : directory){
//            if(p.getUserName().equals(username) && p.getPassword().equals(password) ){                
//                return true;
//            }
//            else
//                return false;
//        }
//        return false;
        Patient user = directory.stream().filter(l -> l.getUserName().equals(username) && l.getPassword().equals(password)).findFirst().orElse(null);
        boolean found = user == null ? false : true;
        return found;
    }
    
    public Patient searchPatientByUsername(String username) {
        for(Patient p : directory) {
            if(p.getUserName().equals(username)){
                return p;
            }
        }
        return null;
    }
    
    public Patient searchPatientByPatientID(int patientID) {
        for(Patient p : directory) {
            if(p.getPatientID() == patientID){
                return p;
            }
        }
        return null;
    }
    
    public Patient searchPatient(String parameter, String value) {
    switch(parameter){
            case "Patient ID":
                for(Patient e: directory){
                    if(e.getPatientID() == Integer.parseInt(value)){
                        return e;
                    }
                }
                break;
            case "First Name":
                for(Patient e: directory){
                    if(e.getFirstName().equals(value)){
                        return e;
                    }
                }
                break;
            case "Community":
                for(Patient e: directory){
                    if(e.getCommunity().equals(value)){
                        return e;
                    }
                }
                break;
            case "City":
                for(Patient e: directory){
                    if(e.getCity().equals(value)){
                        return e;
                    }
                }
            
                
            default:
                    return null;
        }
        return null;
    }

    public void deletePatient(Patient p) {
        directory.remove(p);
    }

}
