package com.cg.project.Passenger_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
	@Autowired
	private PassengerRepository PrRepo;
	
	public Passenger savePassenger(Passenger passenger) {
		return PrRepo.save(passenger);
	}
	
	public List<Passenger> savePassenger(List<Passenger> passenger) {
		return PrRepo.saveAll(passenger);
	}
	
	public List<Passenger> getPassenger(){
		return PrRepo.findAll();
	}
	
	public Passenger getPassengerById(int Pid){
		return PrRepo.findById(Pid).orElse(null);
	}
	
	public String removePassenger(int Pid) {
		PrRepo.deleteById(Pid);
		return "Passenger removed "+Pid;
	}
	
	public Passenger updatePassenger(Passenger passenger) {
		Passenger exitingPassenger=PrRepo.findById(passenger.getPrid()).orElse(null);
		exitingPassenger.setPrName(passenger.getPrName());
		exitingPassenger.setAge(passenger.getAge());
		exitingPassenger.setPrGender(passenger.getPrGender());
		exitingPassenger.setAddress(passenger.getAddress());
		exitingPassenger.setMno(passenger.getMno());
		return PrRepo.save(exitingPassenger);
	}


}
