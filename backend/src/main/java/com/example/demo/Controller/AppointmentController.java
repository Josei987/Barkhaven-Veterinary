package com.example.demo.Controller;

import com.example.demo.Service.ApointmentService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Appointment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("api/appointments") // url
@CrossOrigin(origins = "*")

public class AppointmentController { //controls api calls

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) { // building constructor, passing in needs apptService, a singular one for controller

        this.appointmentService = appointmentService;

    }

@PostMapping
public ResponseEntity<Appointment, appointment> {

        Appointment save = new AppointmentRepository(appointment);
        return ResponseEntity<>(save, createAppointment);

    }

}