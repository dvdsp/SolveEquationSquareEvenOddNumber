/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Library {
    
    public static double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                double choice = Double.parseDouble(sc.nextLine().trim());
                return choice;            
            } catch(NumberFormatException e) {
                System.out.println("*Must be input double (for instance: 6.8)*");
                System.out.print("Enter again:        ");
            }
        }
    }
    
    public static boolean checkOdd(double odd) {
        if (odd % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean checkEven(double even) {
        if (even % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean checkSquareNumber(double square) {
        if ( (int) Math.sqrt(square) * (int) Math.sqrt(square) == square) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
}
