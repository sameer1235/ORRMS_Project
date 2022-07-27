package com.cg.project.Ticket_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	private TicketRepository TktRepo;
	
	public Ticket saveTicket(Ticket tckt) {
		return TktRepo.save(tckt);
	}
	
	public List<Ticket> saveTickets(List<Ticket> tckt) {
		return TktRepo.saveAll(tckt);
	}
	
	public List<Ticket> getTicket(){
		return TktRepo.findAll();
	}
	
	public Ticket getTicketById(int id){
		return TktRepo.findById(id).orElse(null);
	}
	
	public String removeTicket(int id) {
		TktRepo.deleteById(id);
		return "Ticket removed "+id;
	}
	
	public Ticket updateTicket(Ticket tckt) {
		Ticket exitingTicket=TktRepo.findById(tckt.gettId()).orElse(null);
		exitingTicket.setTclass(tckt.getTclass());
		exitingTicket.setSoucre(tckt.getSoucre());
		exitingTicket.setDestination(tckt.getDestination());
		exitingTicket.setDistance(tckt.getDistance());
		exitingTicket.setMoblieNo(tckt.getMoblieNo());
		exitingTicket.setNoOfPassenger(tckt.getNoOfPassenger());
		exitingTicket.setQuota(tckt.getQuota());
		return TktRepo.save(exitingTicket);
	}


}
