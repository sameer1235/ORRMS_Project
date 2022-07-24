package com.cg.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.Entity.Train;

public interface TrainRepository extends JpaRepository<Train, Integer>{
	

}
