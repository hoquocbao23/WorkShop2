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
public class Dean extends Instructor {
    public int tenureInYears;
    public String archievement;

    public Dean( String fullName, String id, String email, String phoneNumber, Address address, String instructorCode, String specializationSubject, int yearOfExp, double salary, String position, int tenureInYears, String archievement) {
        super(fullName, id, email, phoneNumber, address, instructorCode, specializationSubject, yearOfExp, salary, position);
        this.tenureInYears = tenureInYears;
        this.archievement = archievement;
    }
    
    
    
    
}
