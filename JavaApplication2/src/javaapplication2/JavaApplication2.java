/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author shubham
 */
public class JavaApplication2 {
    String name;
    String course;
    int fees;
    public JavaApplication2(String name,String course,int fees){
        this.name=name;
        this.course=course;
        this.fees=fees;
    }
    void display(){
        System.out.println("Student Name: "+name);
         System.out.println("Student Course: "+course);
          System.out.println("Student Fees: "+fees);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
