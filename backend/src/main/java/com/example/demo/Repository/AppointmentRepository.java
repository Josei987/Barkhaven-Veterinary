package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository

public interface AppointmentRepository extends JpaRepository <Appointment, Long> {


}