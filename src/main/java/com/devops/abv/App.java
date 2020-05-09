package com.devops.abv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        Integer n1 = 40;
        Integer n2 = 50;


        System.out.println("Output for the addition is : "+addition(n1,n2));

        System.out.println("Output for the subtraction is : "+subtraction(n1,n2));

        System.out.println("Output for the Multiplication is : "+multiplication(n1,n2));

        System.out.println("Output for the Division is : "+division(Double.valueOf(n1),Double.valueOf(n2)));
    }

    public static Integer addition(Integer a,Integer b){return a+b;}

    public static Integer subtraction(Integer a,Integer b){return  b-a;}

    public static Integer multiplication(Integer a,Integer b){return a*b;}

    public static Double division(Double a,Double b){return  a/b;}
}
