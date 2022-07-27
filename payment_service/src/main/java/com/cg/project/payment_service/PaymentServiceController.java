package com.cg.project.payment_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {
	 @RequestMapping("/{pmtId}")
	    public String getPaymentinfo(@PathVariable("pmtId") int pmtId){
	       return "hello world...!!! This is payment service";
	    }

}
