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
public class EncounterHistory {
    
    private static ArrayList<Encounter> history;

    public EncounterHistory() {
        history = new ArrayList<Encounter>();
    }

    public static ArrayList<Encounter> getHistory() {
        return history;
    }

    public static void setHistory(ArrayList<Encounter> history) {
        EncounterHistory.history = history;
    }

    public Encounter searchHistory(int patientID) {
        for(Encounter e : history) {
            if(e.getPatientID() == patientID){
                return e;
            }
        }
        return null;
    }

    public void addEncounter(Encounter e) {
        history.add(e);
    }
    
    
    
}
