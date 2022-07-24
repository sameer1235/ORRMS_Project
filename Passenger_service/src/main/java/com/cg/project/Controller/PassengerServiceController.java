package com.cg.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.project.Entity.Passenger;
import com.cg.project.Service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerServiceController {
	
	@Autowired
	private PassengerService service;
	
	 @RequestMapping("/{psgrId}")
	    public String getPassengerinfo(@PathVariable("psgrId") int psgrId){
	       return "hello world...!!! This is passenger service";
	    }
	 @PostMapping("/addPassenger")
	    public Passenger addPassenger(@RequestBody Passenger passenger) {
	    	return service.savePassenger(passenger);
	    }
	    @PostMapping("/addPassengers")
	    public List<Passenger> addPassenger(@RequestBody List<Passenger> passenger) {
	    	return service.savePassenger(passenger);
	    }
	    @GetMapping("/getPassenger")
	    public List<Passenger> findAllPassengers(){
	    	return service.getPassenger();
	    }
	    
	    @GetMapping("/getPassenger/{Pid}")
	    public Passenger findPassengerById(@PathVariable int Pid){
	    	return service.getPassengerById(Pid);
	    }
	    
	    @PutMapping("/updatePassenger")
	    public Passenger updateAdmin(@RequestBody Passenger passenger) {
	    	return service.updatePassenger(passenger);
	    }
	    
	    @DeleteMapping("/deletePassenger/{Pid}")
	    public String deleteAdminById(@PathVariable int Pid){
	    	return service.removePassenger(Pid);
	    }

}
