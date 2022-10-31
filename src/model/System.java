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
public class System {
    private static ArrayList<BookAppointment> bookAppointmentDirectory;
    private static ArrayList<City> cityDirectory;
    private static ArrayList<Community> communityDirectory;
    private static ArrayList<Doctor> doctorDirectory;
    private static ArrayList<Encounter> history;
    private static ArrayList<Hospital> hospitalDirectory;
    private static ArrayList<Patient> directory;
    private static ArrayList<Person> personDirectory;

    public static ArrayList<BookAppointment> getBookAppointmentDirectory() {
        return bookAppointmentDirectory;
    }

    public static void setBookAppointmentDirectory(ArrayList<BookAppointment> bookAppointmentDirectory) {
        System.bookAppointmentDirectory = bookAppointmentDirectory;
    }

    public static ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public static void setCityDirectory(ArrayList<City> cityDirectory) {
        System.cityDirectory = cityDirectory;
    }

    public static ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public static void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        System.communityDirectory = communityDirectory;
    }

    public static ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public static void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        System.doctorDirectory = doctorDirectory;
    }

    public static ArrayList<Encounter> getHistory() {
        return history;
    }

    public static void setHistory(ArrayList<Encounter> history) {
        System.history = history;
    }

    public static ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public static void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        System.hospitalDirectory = hospitalDirectory;
    }

    public static ArrayList<Patient> getDirectory() {
        return directory;
    }

    public static void setDirectory(ArrayList<Patient> directory) {
        System.directory = directory;
    }

    public static ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public static void setPersonDirectory(ArrayList<Person> personDirectory) {
        System.personDirectory = personDirectory;
    }
    
    
}
