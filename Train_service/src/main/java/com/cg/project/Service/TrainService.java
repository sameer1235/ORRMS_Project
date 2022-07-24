package com.cg.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.Entity.Train;
import com.cg.project.Repository.TrainRepository;


@Service
public class TrainService {
	@Autowired
	private TrainRepository Trainrepo;
	
	public Train saveTrain(Train trn) {
		return Trainrepo.save(trn);
	}
	
	public List<Train> saveTrains(List<Train> trn) {
		return Trainrepo.saveAll(trn);
	}
	
	public List<Train> getTrains(){
		return Trainrepo.findAll();
	}
	
	public Train getTrainById(int id){
		return Trainrepo.findById(id).orElse(null);
	}
	
	public String removeTrain(int id) {
		Trainrepo.deleteById(id);
		return "Train removed "+id;
	}
	
	public Train updateTrain(Train trn) {
		Train exitingTrain=Trainrepo.findById(trn.getTnId()).orElse(null);
		exitingTrain.setTnName(trn.getTnName());
		exitingTrain.setTnNo(trn.getTnNo());
		exitingTrain.setStartPoint(trn.getStartPoint());
		exitingTrain.setEndPoint(trn.getEndPoint());
		exitingTrain.setArrival(trn.getArrival());
		exitingTrain.setDeparture(trn.getDeparture());
		return Trainrepo.save(exitingTrain);
	}


}
