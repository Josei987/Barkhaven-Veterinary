package com.example.demo.Service;

import com.example.demo.Entity.Appointment;
import com.example.demo.Entity.ApptStatus;
import com.example.demo.Repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Handles business logic for appointments.
 *
 */
@Service // so other layers see that Service was created
public class AppointmentService {

    private final AppointmentRepository appointmentRepository; // final so it methods can't be changed

    /**
     *
     * @param appointmentRepository
     */
    public AppointmentService(AppointmentRepository appointmentRepository) { // constructing appointmentRepository
        this.appointmentRepository = appointmentRepository;

    }

    /**
     *
     * @param appointment
     * @return Appointment
     */
    public Appointment createAppontment(Appointment appointment) { // create appointment, runs table
        appointment.setStatus(ApptStatus.PENDING); // sets status
        return appointmentRepository.save(appointment); // saves the incoming data to the new appointment object / table
    }

    /**
     *
     * @return List<Appointment>
     */
    //this is meant more for developer tools
    //this will display all appointments created to confirm whether data
    //is being properly stored and saved to our database
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
}