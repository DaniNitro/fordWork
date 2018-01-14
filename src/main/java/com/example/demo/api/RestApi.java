package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dashboard;
import com.example.demo.service.RestService;

@RestController
@RequestMapping("/")
public class RestApi {

	@Autowired
	RestService restService;
	
	@GetMapping("users")
	public List<dashboard> data()
	{
		return restService.save_data();
	}
}
