package com.example.demo.Repository;

import com.example.demo.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository; // imports methods from JpaRepo we'll be using

public interface AppointmentRepository extends JpaRepository<Appointment, Long> { // extends those methods to the Appointment objects and their IDs using their type


}
