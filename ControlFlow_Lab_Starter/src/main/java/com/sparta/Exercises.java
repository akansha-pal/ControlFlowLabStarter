package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return temp < 15 ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums)
    {
        double sum = 0;
        for (int i=0 ; i<nums.length ; i++)
            sum += nums[i];
        if(nums.length > 0)
            sum = sum/(nums.length);
        return sum;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        String ticketType = "";
        if (age >= 0 && age < 5){
            ticketType = "Free";
        } else if (age >= 5 && age <= 12) {
            ticketType ="Child";
        } else if (age >= 13 && age <= 17) {
            ticketType= "Student";
        } else if (age >= 18 && age <= 59) {
            ticketType = "Standard";
        }
        else {
            ticketType = "OAP";
        }
        return ticketType;
    }

    // Question 4
    public static String grade(int mark)
    {
        var grade = "";
        if ((mark < 0 || mark >= 0) && mark <=39){
            grade = "Fail";
        } else if (mark >= 40 && mark <= 59) {
            grade = "Pass";
        } else if (mark >= 60 && mark <= 74) {
            grade = "Pass with Merit";
        }
        else {
            grade = "Pass with Distinction";
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        switch (covidLevel) {
            case 0 -> {
                return 200;
            }
            case 1 -> {
                return 100;
            }
            case 2 -> {
                return 50;
            }
            case 3 -> {
                return 50;
            }
            case 4 -> {
                return 20;
            }
            default -> {
                return 0;
            }
        }

    }
}
