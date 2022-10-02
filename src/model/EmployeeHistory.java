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
public class EmployeeHistory {
    
    private ArrayList<Employee>history;
    
    public EmployeeHistory(){
        
        this.history= new ArrayList<Employee>();
        
   
        
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
 
    /**
     *
     * @return
     */
     /*public Employee addNewEmp(Employee employee){
        history.add(employee); 
        return employee;*/
    public Employee addNewEmployee()
    {
        Employee newEmployee=new Employee();
        history.add(newEmployee);
        return newEmployee;
        
      
              
    }
     
     public void deletenewEmployee(Employee em) {
         history.remove(em);
     }
     
     public void updateEmployee(Employee em, int index ){
         history.set(index,em);
     }
     
}
