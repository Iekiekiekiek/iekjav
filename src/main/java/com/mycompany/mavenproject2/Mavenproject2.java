/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String name; // To hold the employee name
        int age; // To hold the empolyee's age
        char gender; //To hold employee's gender
        double salary; // To hold employee's age
        // create a scanner object to read input.
        Scanner console = new Scanner(System.in);
        
         // Get the employee's name
        System.out.println("Enter name:");
        name = console.nextLine();
        
        //Get the employee's age 
        System.out.println("Enter age:");
        age=console.nextInt();
        
        // Get the employee's gender
        System.out.println("Enter gender:(F/M)");
        gender = console.next().charAt(0);
        
        // Get the employee's salary
        System.out.println("Enter salary:");
        salary = console.nextDouble();
        
        // Display the information 
        System.out.println(" Name:"+ name+ "age:" + age +"Gender:" + gender + "salary:" +salary);
        
        
        
        
        
        
}
}
