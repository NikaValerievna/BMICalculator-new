package com.hillel.calculator;

public class BMICalculator {
    public static void main (String[] args){
        double weight = 55;
        double height = 165;

        if(weight <= 0 || height <= 0){
            System.out.println("Please insert correct values.");
            System.exit(0);
        }
        double BMIResult = weight/((height/100*height/100));
        System.out.printf("%.2f",BMIResult);

         if(BMIResult < 18.5){
            System.out.println("\nYou have underweight, eat more!");
        }
        if(BMIResult >= 18.5 && BMIResult < 25){
            System.out.println("\nYou have normal weight, keep it up!.");
        }
        if(BMIResult >= 25 && BMIResult < 30){
            System.out.println("\nYou have overweight, eat a bit less.");
        }
        if(BMIResult >= 30 && BMIResult < 35){
            System.out.println("\nYou have obese, eat less!");
        }
        if(BMIResult >= 35){
            System.out.println("\nYou have extremely obese, it is bad for your health!");
        }
}
}
