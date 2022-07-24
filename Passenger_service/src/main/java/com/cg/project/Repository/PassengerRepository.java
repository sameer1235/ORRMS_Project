package com.cg.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.project.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
