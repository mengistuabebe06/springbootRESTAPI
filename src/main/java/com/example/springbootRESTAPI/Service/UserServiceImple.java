package com.example.springbootRESTAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootRESTAPI.Entity.Operation;
import com.example.springbootRESTAPI.Entity.User;
import com.example.springbootRESTAPI.Repostory.UserRepostory;

@Service
public class UserServiceImple implements UserService{

	@Autowired
	private UserRepostory userRepo;
	
	@Override
	public void registerUser(User user) {
		
		userRepo.save(user);
	}
	
	//calculator 

	@Override
	public int add(Operation opeModel) {
		// TODO Auto-generated method stub
		return opeModel.getNum1() + opeModel.getNum2();
	}

	@Override
	public int sub(Operation opeModel) {
		// TODO Auto-generated method stub
		return opeModel.getNum1() - opeModel.getNum2();
	}

	@Override
	public int mul(Operation opeModel) {
		// TODO Auto-generated method stub
		return opeModel.getNum1() * opeModel.getNum2();
	}

	@Override
	public int div(Operation opeModel) {
		// TODO Auto-generated method stub
		if (opeModel.getNum2() == 0) {
			return -1;
		}
		return opeModel.getNum1() / opeModel.getNum2();
	}
	
	
	
	

}
