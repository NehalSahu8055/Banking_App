//Rock Paper Scissor Game
package com.nehal;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter any number to continue and -1 to exit ");
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        do
        {
        int choice = takeInput();
        int computer = randomNumber();

        if(choice == -1)
            exit(0);

            System.out.println("You      : " + choice );
        System.out.println("Computer : " + computer );



       switch(choice)
       {
           case 0:
               rSP(choice,computer);
               break;
           case 1:
               rSP(choice,computer);
               break;

           case 2:
               rSP(choice,computer);
               break;

           default:
               System.out.println("Invalid Choice");
       }
   }while(times !=-1);


   }

    public static void rSP(int user,int computer){

        if(computer < 3)
        {
            if(user  == computer+1)
                System.out.println("You lost :( \n Better Luck next time");

            else if(user == computer)
            {
                System.out.println("Game is a draw:Play again:");
                rSP(takeInput(), randomNumber());
            }

            else
                System.out.println("Hurray! You Win :) ");



}
    }

    public static int takeInput(){
        int choice;

        Scanner sc = new Scanner(System.in);


        System.out.println("            Welcome to Rock Paper Scissor Game( Computer Vs You :)  )   ");
        System.out.println("                 Enter Your Choice From below:");
        System.out.println("                        0: Scissor");
        System.out.println("                        1: Paper");
        System.out.println("                        2: Rock");
        choice = sc.nextInt();


        return choice;
    }

    public static int randomNumber(){
        Random ran = new Random();
        int computer = ran.nextInt(3);

        return computer;//creating random number by computer
    }
}
