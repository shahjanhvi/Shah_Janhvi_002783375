/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Janhvi Shah
 */
public class VitalSigns {
    private int patientID;
//    private virtual Patient Patient;
    private int doctorID;
    private float height;
    private float weight;
    private float bp;
    private float pulseRate;
    private float sugarLevel;

    public VitalSigns(int patientID, float height, float weight, float bp, float pulseRate, float sugarLevel, int doctorID) {
        this.patientID = patientID;
        this.height = height;
        this.weight = weight;
        this.bp = bp;
        this.pulseRate = pulseRate;
        this.sugarLevel = sugarLevel;
        this.doctorID = doctorID;
    }
    
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int PatientID) {
        this.patientID = PatientID;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBp() {
        return bp;
    }

    public void setBp(float bp) {
        this.bp = bp;
    }

    public float getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(float pulseRate) {
        this.pulseRate = pulseRate;
    }

    public float getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(float sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    
    
}
