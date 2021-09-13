/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String password = "abc123";
        String username = "Andrew";
        System.out.print( "What is your username? " );
        String user = input.next();
        System.out.print("What is your password? ");
        String pass = input.next();

        if(username.equals(user) == true && password.equals(pass) == true){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
