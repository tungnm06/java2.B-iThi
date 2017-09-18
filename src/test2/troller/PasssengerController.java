package test2.troller;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import test2.enity.Passenger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class PasssengerController {

    Scanner scanner = new Scanner(System.in);
    private static PriorityQueue<Passenger> listQueue = new PriorityQueue<>();

    public void display() {
        if (listQueue.isEmpty() == true) {
            System.out.println("Danh sách trống ! ");
        } else {

            System.out.println("----------- ListPassenger ------------");

            for (Passenger psg : listQueue) {

                System.out.println("id: " + psg.getId());
                System.out.println("name: " + psg.getName());
                System.out.println("address: " + psg.getAddress());
                System.out.println("phone : " + psg.getPhone());
                System.out.println("day departure: " + psg.getDepartureday());
                System.out.println("return day: " + psg.getReturnday());
            };

        }
    }

    public boolean add1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Infomation Passenger. ");
        System.out.println("Please enter id");
        String Strid = scanner.nextLine();
        int id = 0;
        try {
            id = Integer.parseInt(Strid);
        } catch (NumberFormatException e) {
            System.out.println("please enter Id is number " + e.getMessage());

        };

        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter address");
        String address = scanner.nextLine();
        System.out.println("Please enter phone");
        String phone = scanner.nextLine();
        System.out.println("Please enter day departure");
        String departureday = scanner.nextLine();
        System.out.println("Please enter day returnday");
        String returnday = scanner.nextLine();

        Passenger pass1 = new Passenger(id, name, address, phone, departureday, returnday);
        listQueue.add(pass1);
        return true;

    }

    public Passenger GetById(int id) {
        for (Passenger psg : listQueue) {
            if (psg.getId() == id) {
                return psg;
            }
        }
        return null;

    }

    public void modify() {
        System.out.println("Enter Reservation ID : ");
        String Strid = scanner.nextLine();
        int id = 0;
        try {
            id = Integer.parseInt(Strid);
        } catch (NumberFormatException e) {
            System.out.println("please enter Id is number " + e.getMessage());

        }
        Passenger psgOld = new Passenger();
        PasssengerController pc = new PasssengerController();
        psgOld = pc.GetById(id);
        if (psgOld != null) {
            System.out.println("ID : " + psgOld.getId());
            System.out.println("Name : " + psgOld.getName());
            System.out.println("Address : " + psgOld.getAddress());
            System.out.println("Phone : " + psgOld.getPhone());
            System.out.println("Departure day : " + psgOld.getDepartureday());
            System.out.println("Return day : " + psgOld.getReturnday());
            System.out.println("Edit Infomatinon passenger");
            System.out.println("New name: ");
            String name = scanner.nextLine();
            System.out.println("New Addresss: ");
            String address = scanner.nextLine();
            System.out.println("New Phone: ");
            String phone = scanner.nextLine();
            System.out.println("New Departure day: ");
            String departureday = scanner.nextLine();
            System.out.println("New Return day: ");
            String returnday = scanner.nextLine();
            Passenger pass2 = new Passenger(id, name, address, phone, departureday, returnday);
            listQueue.remove(psgOld);
            listQueue.add(pass2);
        } else {
            System.out.println("Not foun ID");
        }


    }
}
