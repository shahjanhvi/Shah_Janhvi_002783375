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
public class HospitalDirectory {
    private static ArrayList<Hospital> hospitalDirectory;

    public static Hospital searchHospitalByID(String hospitalID) {
        for(Hospital h : hospitalDirectory) {
            if(h.getHospitalID() == Integer.parseInt(hospitalID)){
                return h;
            }
        }
        return null;
    }

    public static Hospital searchHospitalByName(String valueOf) {
        for(Hospital h : hospitalDirectory) {
            if(h.getHospitalName().equals(valueOf)){
                return h;
            }
        }
        return null;
    }
    
    public HospitalDirectory(){
        hospitalDirectory = new ArrayList<Hospital>();
    }

    public static ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public static void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        HospitalDirectory.hospitalDirectory = hospitalDirectory;
    }
    
    public static Hospital addNewHospital(){
        Hospital h = new Hospital();
        hospitalDirectory.add(h);
        return h;
    }

    public void deleteHospital(Hospital h) {
        hospitalDirectory.remove(h);
    }
    
}
