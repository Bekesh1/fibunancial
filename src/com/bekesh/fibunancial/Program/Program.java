/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.fibunancial.Program;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1,2,3,5,8,13(fibunancial series)
        int f1 = 0, f2 = 1, sum=0;
        for (int i = 1; i <= 10; i++) {
            sum=f1+f2;
            f1=f2;
            f2=sum;
            System.out.println(sum);    
        }
        
    }

}
