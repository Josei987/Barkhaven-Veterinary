package com.example.demo.Service;

import com.demo.Entity.Appointment;
import com.demo.Entity.ApptStatus;
import com.demo.Repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service // so other layers see that Service was created
public class AppointmentService {

    private final AppointmentRepository appointmentRepository; // final so it methods can't be changed

    public appointmentService(AppointmentRepository, appointmentRepository) { // constructing appointmentRepository
        this.appointmentRepository = appointmentRepository;

    }

    public Appointment createAppontment(Appointment appointment) { // create appointment, runs table
        appointment.setStatus(PENDING); // sets status
        return appointmentRepository.save(appointment); // saves the incoming data to the new appointment object / table
    }

}