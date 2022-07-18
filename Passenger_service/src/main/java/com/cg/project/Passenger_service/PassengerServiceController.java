package com.cg.project.Passenger_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerServiceController {
	 @RequestMapping("/{psgrId}")
	    public String getPassengerinfo(@PathVariable("psgrId") int psgrId){
	       return "hello world...!!! This is passenger service";
	    }

}
