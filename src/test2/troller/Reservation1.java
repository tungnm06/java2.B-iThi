/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.troller;

import java.util.Scanner;
import test2.enity.Passenger;

/**
 *
 * @author Administrator
 */
public class Reservation1 {
   
    public static void main(String[] args) {
        Reservation1 menu = new Reservation1();
        menu.createMenu();
        
    }

    public void createMenu() {
        while (true) {

            System.out.println("======Menu======");
            System.out.println("1. Add reservation.");
            System.out.println("2. Modify passenger records.");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit.");
            System.out.println("==========================");
            System.out.println("Please enter your choice:");

            Scanner scanner = new Scanner(System.in);
            String strChoice1 = scanner.nextLine();
            
            PasssengerController passsengerController = new PasssengerController();
            
            if (strChoice1 == "4") {

                System.exit(0);

            } else {
                switch (strChoice1) {
                    case "1":
                        passsengerController.add1();
                        createMenu();

                    case "2":
                        passsengerController.modify();
                        createMenu();

                    case "3":
                        passsengerController.display();
                        createMenu();
                        
                    
                    default:
                        System.out.println("Please enter number from 1 to 4");
                        continue;
                }
            }

        }

    }
}
