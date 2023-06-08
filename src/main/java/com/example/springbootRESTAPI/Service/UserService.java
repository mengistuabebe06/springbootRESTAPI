package com.example.springbootRESTAPI.Service;

import com.example.springbootRESTAPI.Entity.Operation;
import com.example.springbootRESTAPI.Entity.User;

public interface UserService {
	
	public User registerUser(User user);
	
	public int add(Operation operation);
	public int sub(Operation operation);
	public int mul(Operation operation);
	public int div(Operation operation);
	
}
