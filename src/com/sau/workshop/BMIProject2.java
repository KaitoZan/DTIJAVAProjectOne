package com.sau.workshop;

import  java.io.IOException;
import java.io.InputStreamReader;
import  java.io.BufferedReader;
import java.text.DecimalFormat;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String empName;
        double weight,heightM,heightCm,BMI ;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat num = new DecimalFormat("0.000");


        System.out.println("***********************************");
        System.out.println("      BMI Program by DTI-SAU");
        System.out.println("***********************************");

        System.out.print("Input employee name : ");
        empName = reader.readLine();
        System.out.print("Input Weight (kg) : ");
        weight = Double.parseDouble(reader.readLine());
        System.out.print("Input Hight (cm) : ");
        heightCm = weight = Double.parseDouble(reader.readLine());

        System.out.println("-----------------------------");
        heightM = heightCm / 100;
        BMI = (weight/ Math.pow(heightM, 2));
        System.out.println("Your name : "+empName);
        System.out.println("Your Weight : "+weight+" (kg) Hight : "+heightCm+(" (cm)"));
        System.out.println("BMI : "+num.format(BMI));


    }
}
