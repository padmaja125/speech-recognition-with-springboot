package com.project.airlinereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.airlinereservation.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository< Reservation, Long>{

}
