package com.company;

public class AttendeeDemo {

    public static void main(String[] args) {
        AttendeeManager attendeeManager = new AttendeeManager();
        try {
            attendeeManager.createByID("12345678");
        } catch (InvalidIDNumberException e) {
            e.printStackTrace();
        }
    }
}
