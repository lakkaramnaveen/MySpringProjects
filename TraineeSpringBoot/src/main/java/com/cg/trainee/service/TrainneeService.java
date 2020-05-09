package com.cg.trainee.service;

import java.util.List;

import com.cg.trainee.entity.Trainee;
import com.cg.trainee.exception.TraineeException;

public interface TrainneeService {

	public  List<Trainee>   findAllTrainees();
	public  Trainee   findTraineeById(int traineeId) throws TraineeException ;
	public  Trainee  addTrainee(Trainee trainee);
	public  Trainee  deleteTraineeById(int traineeId);
	public Trainee updateTraineeById(int traineeId ,Trainee trainee) ;
}
