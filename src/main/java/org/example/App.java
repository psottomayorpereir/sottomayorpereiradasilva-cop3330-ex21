package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int month=0;
        String mon="";
        System.out.print("Enter a number from 1 to 12: ");
        month=sc.nextInt();

        switch(month){
            case 1:  mon = "January";
                break;
            case 2:  mon = "February";
                break;
            case 3:  mon = "March";
                break;
            case 4:  mon = "April";
                break;
            case 5:  mon = "May";
                break;
            case 6:  mon = "June";
                break;
            case 7:  mon = "July";
                break;
            case 8:  mon = "August";
                break;
            case 9:  mon = "September";
                break;
            case 10: mon = "October";
                break;
            case 11: mon = "November";
                break;
            case 12: mon = "December";
                break;
            default: mon = "Invalid month";
                break;
        }
        System.out.printf("The number %d corresponds to: %s",month,mon);
    }
}