package com.cg.project.Ticket_service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ticket")
public class TicketServiceController {
	
	public TicketService service;
	
	@RequestMapping("/{tikectId}")
    public String getTicketInfo(@PathVariable("tikectId") int tikectId){
       return "hello world...!!! This is Tikect service";
    }

	 @PostMapping("/addTicket")
	    public Ticket addTicket(@RequestBody Ticket tckt) {
	    	return service.saveTicket(tckt);
	    }
	    @PostMapping("/addTickests")
	    public List<Ticket> addTickets(@RequestBody List<Ticket> tckt) {
	    	return service.saveTickets(tckt);
	    }
	    @GetMapping("/getTicket")
	    public List<Ticket> findAllTickets(){
	    	return service.getTicket();
	    }
	    
	    @GetMapping("/getTicket/{id}")
	    public Ticket findTicketById(@PathVariable int id){
	    	return service.getTicketById(id);
	    }
	    
	    @PutMapping("/updateTicket")
	    public Ticket updateTicket(@RequestBody Ticket tckt) {
	    	return service.updateTicket(tckt);
	    }
	    
	    @DeleteMapping("/deletTicket/{id}")
	    public String deleteAdminById(@PathVariable int id){
	    	return service.removeTicket(id);
	    }

}
