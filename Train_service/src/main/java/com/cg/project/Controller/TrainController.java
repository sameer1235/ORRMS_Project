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

import com.cg.project.Entity.Train;
import com.cg.project.Service.TrainService;

@RestController
@RequestMapping("/train")
public class TrainController {
	@Autowired
	private TrainService service;
	
	    @GetMapping("/{trainId}")
	    public String getTraininfo(@PathVariable("trainId") int trainId){
	       return "hello world...!!! This is train service";
	      
	    }
	    @PostMapping("/addTrain")
	    public Train addTrain(@RequestBody Train trn) {
	    	return service.saveTrain(trn);
	    }
	    
	    @GetMapping("/getTrain")
	    public List<Train> findAllTrains(){
	    	return service.getTrains();
	    }
	    
	    @GetMapping("/getTrain/{id}")
	    public Train findTrainById(@PathVariable int id){
	    	return service.getTrainById(id);
	    }
	    
	    @PutMapping("/updateTrain")
	    public Train updateTrain(@RequestBody Train trn) {
	    	return service.updateTrain(trn);
	    }
	    
	    @DeleteMapping("/deleteTrain/{id}")
	    public String deleteTrainById(@PathVariable int id){
	    	return service.removeTrain(id);
	    }


}
