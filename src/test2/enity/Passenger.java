/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.enity;

/**
 *
 * @author Administrator
 */
public class Passenger {
    private String name;
    private int id;
    private String address ;
    private String phone;
    private String departureday;
    private String returnday;

    public Passenger() {
    }

    public Passenger(int id, String name,  String address, String phone, String departureday, String returnday) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.departureday = departureday;
        this.returnday = returnday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartureday() {
        return departureday;
    }

    public void setDepartureday(String departureday) {
        this.departureday = departureday;
    }

    public String getReturnday() {
        return returnday;
    }

    public void setReturnday(String returnday) {
        this.returnday = returnday;
    }
    
    
}
