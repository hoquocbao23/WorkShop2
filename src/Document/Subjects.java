/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Document;


import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Subjects extends Document{

    
    private String subjectCode;
    private String subjectName;
    private String references;
    private int numberOfCredit = 1;
    private int numberOfTest = 2;
    private double tuitionFee;

    public Subjects( String nameOfDoc, String author, int yearOfPublication, double price, String subjectCode, String subjectName, String references) {
        super(nameOfDoc, author, yearOfPublication, price);
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.references = references;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
    
    
    public int getNumberOfCredit() {
        return numberOfCredit;
    }

    public boolean setNumberOfCredit(int numberOfCredit) {
        if (numberOfCredit >= 1 && numberOfCredit <= 4) {
            this.numberOfCredit = numberOfCredit;
            return true;
        } else {
            System.out.println("Number of credits must be between 1 and 4 .");
        }
        return false;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public boolean setNumberOfTest(int numberOfTest) {
        if (numberOfTest >= 2 || numberOfTest < 5) {
            this.numberOfTest = numberOfTest;
            return true;
        } else {
            System.out.println("Number of tests must be between 2 and 4");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Subjects{" + "nameOfDoc=" + nameOfDoc + ", author=" + author + ", yearOfPublication=" + yearOfPublication + ", price=" + price + "subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", references=" + references + ", numberOfCredit=" + numberOfCredit + ", numberOfTest=" + numberOfTest + '}';
    }
    
    public double tuitionPay() {
        this.tuitionFee = this.numberOfCredit * 560;
        System.out.println("Hoc Phi Mon " + this.getSubjectCode()  + ": " + this.tuitionFee);
        return this.tuitionFee;
    }
    
    

    

}
