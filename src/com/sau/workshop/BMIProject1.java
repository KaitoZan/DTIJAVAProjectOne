package com.sau.workshop;

import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        String empName;
        double weight,heightM,heightCm,BMI ;

        System.out.println("***********************************");
        System.out.println("      BMI Program by DTI-SAU");
        System.out.println("***********************************");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input employee name : ");
        empName = sc.next();
        System.out.print("Input Weight (kg) : ");
        weight = sc.nextDouble();
        System.out.print("Input Hight (cm) : ");
        heightCm = sc.nextDouble();

        System.out.println("-----------------------------");
        heightM = heightCm / 100;
        BMI = (weight/ Math.pow(heightM, 2));
        System.out.println("Your name : "+empName);
        System.out.println("Your Weight : "+weight+" (kg) Hight : "+heightCm+(" (cm)"));
        System.out.println(String.format("BMI: %.2f", BMI));


    }
}
