package com.example.demo.Controller;

import com.example.demo.Service.AppointmentService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Appointment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/appointments") // url
@CrossOrigin(origins = "*")

public class AppointmentController { //controls api calls

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) { // building constructor, passing in needs apptService, a singular one for controller

        this.appointmentService = appointmentService;

    }

    //takes the user input information from frontend and saves that to
    //the var saved which is passed into createAppointment() which is in 
    //AppointmentService
    @PostMapping
    public ResponseEntity<Appointment>createAppointment(@RequestBody Appointment appointment) {

        Appointment saved = appointmentService.createAppontment(appointment);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);

    }

    @GetMapping
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }
}