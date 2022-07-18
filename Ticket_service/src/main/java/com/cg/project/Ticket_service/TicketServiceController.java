package com.cg.project.Ticket_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketServiceController {
	@RequestMapping("/{tikectId}")
    public String getTicketInfo(@PathVariable("tikectId") int tikectId){
       return "hello world...!!! This is Tikect service";
    }

	
}
