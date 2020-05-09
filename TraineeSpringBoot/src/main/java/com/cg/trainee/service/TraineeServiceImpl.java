package com.cg.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.dao.TraineeDao;
import com.cg.trainee.entity.Trainee;
import com.cg.trainee.exception.TraineeException;

@Service
public class TraineeServiceImpl implements TrainneeService {

	   @Autowired
	   TraineeDao  traineeDao;
	   
	@Override
	public List<Trainee> findAllTrainees() {
		
		List<Trainee> list = traineeDao.findAll();
		
		return list;
	}

	@Override
	public Trainee findTraineeById(int traineeId) throws TraineeException
	{
		
		Trainee traine = null;
		if( traineeDao.existsById(traineeId))
		{
			traine = traineeDao.findById(traineeId).get();
		}
		else
		{
			throw new TraineeException(traineeId+ " ID NOT FOUND ");
		}
		return traine;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		traineeDao.saveAndFlush(trainee);
		return trainee;
	}

	@Override
	public Trainee deleteTraineeById(int traineeId) {
		
		Trainee  traine =null;
		
		if( traineeDao.existsById(traineeId))
		{
			 traine = traineeDao.findById(traineeId).get();
			 traineeDao.deleteById(traineeId);
		}
		return traine ;
	}

	@Override
	public Trainee updateTraineeById(int traineeId ,Trainee trainee) {
		
				
		if( traineeDao.existsById(traineeId))
		{
			 Trainee traine = traineeDao.findById(traineeId).get();
			 traineeDao.saveAndFlush(trainee);
		}
		return trainee ;
	}

	
}
