package com.cg.project.admin_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Admin_service_controller {
	
	    @GetMapping("/{adminId}")
	    public String getadmininfo(@PathVariable("adminId") int adminId){
	       return "hello world...!!! This is admin service";
	      
	    }

}
