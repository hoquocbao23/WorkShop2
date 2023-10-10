/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import Document.*;
import Person.*;
import Address.*;

/**
 *
 * @author Admin
 */
public class WorkShop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address add = new Address("11d17", "D17", "phuoclongb", "thuduc", "HCM");
        
        Subjects sub = new Subjects("PRO ZEROTOHERO", "PHUCNT", 2023, 100, "PRO", "JAVAFUNCT", "PHUCNT");
        sub.setNumberOfCredit(4);
        sub.setNumberOfTest(4);
        System.out.println(sub.toString());
        sub.tuitionPay();
        
        Student student1 = new Student("QUOCBAO", "SE181694", "baonhqse181694", "0935311074", add, "SE181694", "", "SE","TOP1", (Subjects)sub);
        System.out.println(student1.toString());
        student1.payTuition();
        student1.nhapDiem();
        student1.diemTrungBinh();
        
        
        
        
    }
    
    
}
