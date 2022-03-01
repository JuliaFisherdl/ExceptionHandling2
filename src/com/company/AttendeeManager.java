package com.company;

public class AttendeeManager {

        public Attendee createByID(String id) throws InvalidIDNumberException {
            if (id.length() == 8) {
                Attendee attendee = new Attendee(id);
                System.out.println(attendee.getIdNumber() + " created.");
                return attendee;
            } else {
                throw new InvalidIDNumberException("Error when creating attendee.Invalid ID Number.");
            }
        }
    }
