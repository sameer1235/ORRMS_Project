package com.cg.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
