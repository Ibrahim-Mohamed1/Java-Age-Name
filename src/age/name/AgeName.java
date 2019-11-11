/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age.name;

import java.util.Scanner;

public class AgeName
{

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("What is your name? \n");
        
        String name = kbd.next();
        
        System.out.println("\nWhat is your age? \n");
        
        int age = kbd.nextInt();
        
        System.out.printf("\nWelcome %s, you are %d years olds! \n\n", name, age);
        
    }
    
}
