/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Address.Address;
import Document.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person {
    private Scanner sc = new Scanner(System.in);
    private String studentCode;
    private String key;
    private String major;
    private String studentRating;
    
    private Subjects subject;
    private double [] mark = new double [4];  
    
    
    

    public Student( String fullName, String id, String email, String phoneNumber, Address address, String studentCode, String key, String major, String studentRating, Subjects sub) {
        super(fullName, id, email, phoneNumber, address);
        this.studentCode = studentCode;
        this.key = key;
        this.major = major;
        this.studentRating = studentRating;
        this.subject = sub;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentRating() {
        return studentRating;
    }

    public void setStudentRating(String studentRating) {
        this.studentRating = studentRating;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
    public void goToSchool(){
        System.out.println(super.getFullName().toUpperCase() + " dang di den truong");
    }
    public void doHomeWork(){
        System.out.println(super.getFullName().toUpperCase() + " dang lam bai tap");
    }
    public void payTuition(){
        System.out.println(super.getFullName().toUpperCase() + " da dong " + subject.tuitionPay() +" tien hoc phi "+ subject.getSubjectCode());
    }
    public void takingExam(){
        System.out.println(super.getFullName().toUpperCase() + " dang di den truong");
    }

    @Override
    public String toString() {
        return "Student{" + "studentCode=" + studentCode + ", fullName = " + super.fullName +", key=" + key + ", major=" + major + ", studentRating=" + studentRating +'}';
    }
    
    public void nhapDiem() {
        int baiTest = this.subject.getNumberOfTest();
        for (int i = 0; i < baiTest; i++) {
            do {
                System.out.println("mark" + (i + 1) + ":");
                mark[i] = Double.parseDouble(sc.nextLine());
            }while (mark[i] >10 || mark[i] < 0);
        }
    }

    public void diemTrungBinh() {
        double tongDiem = 0;
        int baiTest = this.subject.getNumberOfTest();
        switch (baiTest) {
            case 2:
                tongDiem = mark[0] * 0.3 + mark[1] * 0.7;
                break;
            case 3:
                tongDiem = mark[0] * 0.2 + mark[1] * 0.3 + mark[2] * 0.5;
                break;
            case 4:
                tongDiem = mark[0] * 0.1 + mark[1] * 0.2 + mark[2] * 0.3 + mark[3] * 0.4;
                break;
        }
        System.out.println("AVG:" + tongDiem);
        if ( tongDiem >= 4) {
            System.out.println("Passed");
        }else System.out.println("Not Passed");

    }
    
    
    

    

}
