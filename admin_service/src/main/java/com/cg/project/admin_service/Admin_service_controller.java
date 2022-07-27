package com.cg.project.admin_service;

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

@RestController
@RequestMapping("/admin")
public class Admin_service_controller {
	@Autowired
	private AdminService service;
	
	    @RequestMapping("/{adminId}")
	    public String getadmininfo(@PathVariable("adminId") int adminId){
	       return "hello world...!!! This is admin service";
	      
	    }
	    @PostMapping("/addAdmin")
	    public Admin_service addAdmin(@RequestBody Admin_service admin) {
	    	return service.saveAdmin(admin);
	    }
	    @PostMapping("/addAdmins")
	    public List<Admin_service> addAdmin(@RequestBody List<Admin_service> admin) {
	    	return service.saveAdmins(admin);
	    }
	    @GetMapping("/getadmin")
	    public List<Admin_service> findAllAdmins(){
	    	return service.getAdmin();
	    }
	    
	    @GetMapping("/getadmin/{a_id}")
	    public Admin_service findAdminById(@PathVariable int a_id){
	    	return service.getAdminById(a_id);
	    }
	    
	    @PutMapping("/updateAdmin")
	    public Admin_service updateAdmin(@RequestBody Admin_service admin) {
	    	return service.updateAdmin(admin);
	    }
	    
	    @DeleteMapping("/deleteadim/{a_id}")
	    public String deleteAdminById(@PathVariable int a_id){
	    	return service.removeAdmin(a_id);
	    }
}
