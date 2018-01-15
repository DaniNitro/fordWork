package com.example.demo.api;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dashboard;
import com.example.demo.repository.dashboardRepo;
import com.example.demo.service.RestService;

@RestController
@RequestMapping("/")
public class RestApi {

	@Autowired
	private RestService restService;
	
	@Autowired
	private dashboardRepo dashboardRepo; 
	
	@GetMapping("users")
	public List<Dashboard> data()
	{
		List<Dashboard> data = dashboardRepo.findAll();
		return data;
	}
}
