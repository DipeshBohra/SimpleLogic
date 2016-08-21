/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Programmers.ReportCard;



/**
 *
 * @author SchizoBrain
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double scs= 65, eng=85, nep=45, math=75, acc=82;
       double totalmarks=500;
       double obtainedmarks=(scs+eng+nep+math+acc);
       double passmark=32;
       double percentage=(obtainedmarks/5);
       String grade="";
       
        System.out.println("======Report Card======");
        System.out.println("Subjects\tMarks");
        System.out.println("Science\t\t"+scs);
        System.out.println("Nepali\t\t"+nep);
        System.out.println("English\t\t"+eng);
        System.out.println("Mahts\t\t"+math);
        System.out.println("Account\t\t"+acc);
        System.out.println("------------------------");
        System.out.println("MarksObtained\t"+obtainedmarks);

        if (scs<32 || eng<passmark || nep<passmark || math<passmark || acc<passmark){
            System.out.println("Sorry You Are Fail"); 
              
        }
        else if(percentage>=80){
            grade="Distinction";
            
        }
        else if(percentage>=60){
            grade="First Division";
            
        }
        else if(percentage>=45){
            grade="Second Division";
            
        }
        else if(percentage>=32){
            grade="Third Division";
            
        }
        System.out.println("Percentage\t"+percentage);
        System.out.println("Grade\t\t"+grade);
    }
}
