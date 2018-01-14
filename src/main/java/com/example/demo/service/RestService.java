package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.RestModel;

@Service
public class RestService {

	
	public List<RestModel> getname()
	{
		List<RestModel> users=new ArrayList<>();
		
		for(int i=0;i<10;i++)
		{
			RestModel model=new RestModel();
			model.setId((i+1));
			model.setName("Username"+(i+1));
			users.add(model);
		}
		return users;
		
	}
}
