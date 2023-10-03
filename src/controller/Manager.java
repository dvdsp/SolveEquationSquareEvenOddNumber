/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import static common.Library.checkEven;
import static common.Library.checkInputDouble;
import static common.Library.checkOdd;
import static common.Library.checkSquareNumber;
import view.Menu;

/**
 *
 * @author DELL
 */
public class Manager extends Menu<String>{
    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "exit"}; 
    protected Library validate;
    public Manager() {
        
        super("\n             CALCULATE   ", mc);
        validate = new Library();
        
    }
    @Override
    public void execute(int choice) {
       switch(choice) {
            case 1 : superlativeEquation(); break;
            case 2 : quadraticEquation();   break;
            case 3 :
                System.exit(0);
                   
       }
    }
    
    public void superlativeEquation() {// phuong trinh sieu vi
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x =  " + x);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }
    
    public void quadraticEquation() { // phuong trinh bac 2
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(c)) {
            System.out.print(b + " ");
        }
        if (checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}











































































