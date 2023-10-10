/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Address.Address;
import Document.Subjects;

/**
 *
 * @author Admin
 */
public class Graduates extends Student {
     private String position;
    private double salary;

    public Graduates( String fullName, String id, String email, String phoneNumber, Address address, String studentCode, String key, String major, String studentRating, Subjects subject, String position, double salary) {
        super(fullName, id, email, phoneNumber, address, studentCode, key, major, studentRating, subject);
        this.position = position;
        this.salary = salary;
    }
    
    
    

    
    
    
   
    
    

    

}
