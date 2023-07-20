/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3_Interface;

/**
 *
 * @author Moatasem
 */
 // A و ينفذ الإنترفيس B يرث من الكلاس C هنا الكلاس
public class C extends B implements A{
    
    @Override                            // printA() للدالة Override مجبور أن يفعل C الكلاس
    public void printA() {
        System.out.println("C should Override the method printA()");
    }
    
}
