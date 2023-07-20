/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2_Interface;

/**
 *
 * @author Moatasem
 */

// // printB() و printA() للدالتين Override إذاً يجب أن يفعل .A و الذي بدوره يرث من الإنترفيس B يطبق من الإنترفيس C هنا الكلاس
public class C implements B{
    
    @Override                 // printA() للدالة Override مجبور أن يفعل C الكلاس
    public void printA() {
        System.out.println("C should Override the method printA()");
    }
 
    @Override                 // printB() للدالة Override مجبور أن يفعل C الكلاس
    public void printB() {
        System.out.println("C should Override the method printB()");
    }

    
}
