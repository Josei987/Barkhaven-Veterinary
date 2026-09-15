package com.example.demo.Service;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentService {

    private final String id; //using random generator
    private final LocalDate date;
    private final LocalTime startTime;
    //private final LocalTime endTime;

    public createAppointment(String id, LocalDate date, LocalTime time, String ownerNamer, String petName, String phoneNumber, String email) { // later uer and pet ids

        Appointment appt = new Appointment();

        this.id = id;
        this.date = date;
        this.time = time;
        this.ownerName = ownerName;
        this.petName = petName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status; //enum



        status = "Scheduled";



    }

    /*public checkAvailability() {

        if(SCHEDULED == true) {
            status = false;

        }

        if(CANCELED) {

        }

    }*/


    public cancelAppointment(Appointment appt) {




        status = "canceled";



    }



}