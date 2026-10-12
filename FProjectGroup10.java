/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fprojectgroup10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FProjectGroup10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String Ename = input.nextLine(); // Ename = employee name

        System.out.print("Hours Worked: ");
        int Hworked = input.nextInt(); // Hworked = hours worked

        System.out.print("Hourly Rate: ");
        int Hrate = input.nextInt(); // Hrate = hourly rate

        int regHours = (Hworked > 40 ? 40 : Hworked);
        int otHours = (Hworked > 40 ? Hworked - 40 : 0);

        double regSalary = regHours * Hrate;
        double otPay = otHours * (Hrate * 1.5);
        double totalSalary = regSalary + otPay;

        System.out.println("\n---SALARY DETAILS---");
        System.out.println("Employee: " + Ename);
        System.out.println("Regular Hours: " + Hworked);
        System.out.println("Overtime Hours: " + otHours);
        System.out.println("Regular Pay: " + regSalary);
        System.out.println("Overtime Pay: " + otPay);
        System.out.println("Total Salary: " + totalSalary);

    }
}