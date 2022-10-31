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
public class PersonDirectory {
    private static ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        personDirectory = new ArrayList<Person>();
//        System.out.println("test");
        for(Person p: personDirectory){
//           System.out.println(p.getUsername());
        }
    }

    public static ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }
    
    public static void addPerson(Person p) {
        personDirectory.add(p);
    }

    public static void setPersonDirectory(ArrayList<Person> personDirectory) {
        PersonDirectory.personDirectory = personDirectory;
    }
    
    public boolean authenticateAdmin(String username, String password) {
        Person user = personDirectory.stream().filter(l -> l.getUsername().equals(username) && l.getPassword().equals(password)).findFirst().orElse(null);
        boolean found = user == null ? false : true;
        return found;
    }

    public String getPersonRole(String username) {
        for(Person p : personDirectory){
            if(p.getUsername().equals(username)){
                return p.getRole();
            }
        }
        return null;
    }

    public void deletePerson(Person p) {
        personDirectory.remove(p);
    }

    public Person searchPerson(String parameter, String value) {
        switch(parameter){
            case "Person ID":
                for(Person e: personDirectory){
                    if(e.getPersonID() == Integer.parseInt(value)){
                        return e;
                    }
                }
                break;
            case "First Name":
                for(Person e: personDirectory){
                    if(e.getFirstName().equals(value)){
                        return e;
                    }
                }
                break;
            case "Role":
                for(Person e: personDirectory){
                    if(e.getRole().equals(value)){
                        return e;
                    }
                }
            default:
                    return null;
        }
        return null;
    }

    public Person searchPersonByDoctorID(int personID) {
        for(Person d : personDirectory) {
            if(d.getPersonID()== personID){
                return d;
            }
        }
        return null;
    }
    
    
    
    
}
