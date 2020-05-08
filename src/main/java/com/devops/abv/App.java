package com.devops.abv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer n1 = 40;
        Integer n2 = 50;

        System.out.println("Output for the addition is : "+addition(n1,n2));

        System.out.println("Output for the subtraction is : "+subtraction(n1,n2));
    }

    public static Integer addition(Integer a,Integer b){return a+b;}

    public static Integer subtraction(Integer a,Integer b){return  b-a;}
}
