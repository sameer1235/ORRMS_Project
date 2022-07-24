package com.cg.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.project.Entity.Payment;
import com.cg.project.Repository.PaymentRepository;


public class PaymentService {
	@Autowired
	private PaymentRepository PyRepo;
	
	public Payment savePayment(Payment pymt) {
		return PyRepo.save(pymt);
	}
	
	public List<Payment> savePayment(List<Payment> pymt) {
		return PyRepo.saveAll(pymt);
	}
	
	public List<Payment> getPayment(){
		return PyRepo.findAll();
	}
	
	public Payment getPaymentById(int id){
		return PyRepo.findById(id).orElse(null);
	}


}
