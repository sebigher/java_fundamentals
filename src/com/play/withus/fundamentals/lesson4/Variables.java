package com.play.withus.fundamentals.lesson4;

import sun.util.resources.ga.LocaleNames_ga;

public class Variables {
     //declaring the variables
    // and not initializing them: defaults are in place
    String firstName = "Mary";
    int age;
    long ageInSeconds;
    double salary;
    float  weight;
    boolean isStudent;

    String middleName = "Has", lastName="Alamb"; //multiple declaration and initialization

    public static void main(String[] args)
    {
        Variables variables = new Variables() ;
        variables.firstName = "Joe";
        System.out.println("firstName is : " + variables.firstName);

        System.out.println("age is:" + variables.age);
        variables.age = Integer.MAX_VALUE; //2 147 483 647
        System.out.println("age is : " +  variables.age);

        System.out.println("salary is " + variables.salary);
        variables.salary = 1200.00; // double is default
        variables.weight = 120.23f;

        System.out.println("is student:  " + variables.isStudent); // false is default
        System.out.println("age in seconds : " + variables.ageInSeconds);

        variables.ageInSeconds= Long.MAX_VALUE;
        System.out.println("age in seconds : " + variables.ageInSeconds); // 9 223 372 036 854 775 807
       // variables.age =  3000000000;// compile time: integer number too large
       //variables.ageInSeconds = 3000000000;  // integer number too large if we are not labelling it as long
        variables.ageInSeconds = 300000000L; //integer is the default, but you have to pay attention to the values

    }


}
