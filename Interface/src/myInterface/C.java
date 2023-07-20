/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myInterface;

/**
 *
 * @author Moatasem
 */

// لجميع الدوال التي ورثها Override إذاً يجب أن يفعل B و الإنترفيس A ينفذ الإنترفيس C هنا الكلاس
public class C implements A , B{
    
    
    @Override                 // printA() للدالة Override مجبور أن يفعل C الكلاس
    public void printA() {
        System.out.println("C should Override the method printA()");
    }
 
    @Override                 // printB() للدالة Override مجبور أن يفعل C الكلاس
    public void printB() {
        System.out.println("C should Override the method printB()");
    
   }
}
