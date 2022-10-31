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
public class BookAppointmentDirectory {
    private static ArrayList<BookAppointment> bookAppointmentDirectory;

    public static BookAppointment addNewAppointment() {
        BookAppointment b = new BookAppointment();
        bookAppointmentDirectory.add(b);
        return b;
    }

    public BookAppointmentDirectory() {
        bookAppointmentDirectory = new ArrayList<BookAppointment>();
    }
    
    public static ArrayList<BookAppointment> getBookAppointmentDirectory() {
        return bookAppointmentDirectory;
    }

    public static void setBookAppointmentDirectory(ArrayList<BookAppointment> bookAppointmentDirectory) {
        BookAppointmentDirectory.bookAppointmentDirectory = bookAppointmentDirectory;
    }
    
    
    
}
