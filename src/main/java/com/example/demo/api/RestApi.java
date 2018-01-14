package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RestModel;
import com.example.demo.service.RestService;

@RestController
@RequestMapping("/")
public class RestApi {

	@Autowired
	RestService restService;
	
	@RequestMapping("users")
	public List<RestModel> user()
	{
		return restService.getname();
	}
}
