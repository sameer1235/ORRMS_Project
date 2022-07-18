package com.cg.project.Train_service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/train")
public class TrainServiceController {
	@RequestMapping("/{trainId}")
    public String getTraininfo(@PathVariable("trainId") int trainId){
       return "hello world...!!! This is Train service";
    }
}
