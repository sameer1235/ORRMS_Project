package com.cg.project.admin_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private Admin_serviceRepo Adminrepo;
	
	public Admin_service saveAdmin(Admin_service admin) {
		return Adminrepo.save(admin);
	}
	
	public List<Admin_service> saveAdmins(List<Admin_service> admin) {
		return Adminrepo.saveAll(admin);
	}
	
	public List<Admin_service> getAdmin(){
		return Adminrepo.findAll();
	}
	
	public Admin_service getAdminById(int a_id){
		return Adminrepo.findById(a_id).orElse(null);
	}
	
	public String removeAdmin(int a_id) {
		Adminrepo.deleteById(a_id);
		return "Admin removed "+a_id;
	}
	
	public Admin_service updateAdmin(Admin_service admin) {
		Admin_service exitingAdmin=Adminrepo.findById(admin.getA_id()).orElse(null);
		exitingAdmin.setName(admin.getName());
		exitingAdmin.setA_username(admin.getA_username());
		exitingAdmin.setA_Password(admin.getA_Password());
		return Adminrepo.save(exitingAdmin);
	}
}

