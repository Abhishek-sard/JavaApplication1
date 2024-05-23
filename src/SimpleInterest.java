/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhishek sardar
 */
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]args){
        double p,t,r,b,c,ci,a;
        System.out.println("Enter the principle");
        System.out.println("Enter the time");
        System.out.println("Enter the rate");
        Scanner s= new Scanner(System.in);
        p=s.nextDouble();
        t=s.nextDouble();
        r=s.nextDouble();
         b=(1+(r/100));
        c=Math.pow(b,2);
        a=p*c;
        ci=a-p;
        System.out.println("The compund rate is:"+ci);

    }
    
}
