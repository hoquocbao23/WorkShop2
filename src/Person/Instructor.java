/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Address.Address;

/**
 *
 * @author Admin
 */
public class Instructor extends Person{
    private String instructorCode;
    private String specializationSubject;
    private int yearOfExp;
    private double salary;
    private String position;

    public Instructor( String fullName, String id, String email, String phoneNumber, Address address, String instructorCode, String specializationSubject, int yearOfExp, double salary, String position) {
        super(fullName, id, email, phoneNumber, address);
        this.instructorCode = instructorCode;
        this.specializationSubject = specializationSubject;
        this.yearOfExp = yearOfExp;
        this.salary = salary;
        this.position = position;
    }
    
    
    
    
    
}
