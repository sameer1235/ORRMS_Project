package com.cg.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.Entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
