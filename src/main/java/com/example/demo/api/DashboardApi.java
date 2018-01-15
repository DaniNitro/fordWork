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
import com.example.demo.repository.DashboardRepository;
import com.example.demo.service.DashboardService;

@RestController
@RequestMapping("/")
public class DashboardApi {

	@Autowired
	private DashboardService restService;
	
	@Autowired
	private DashboardRepository dashboardRepo; 
	
	@GetMapping("users")
	public List<Dashboard> data()
	{
		List<Dashboard> data = dashboardRepo.findAll();
		return data;
	}
}
