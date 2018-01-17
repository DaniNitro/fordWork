package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Datasheet;
import com.example.demo.repository.DatasheetRepository;
import com.example.demo.service.DatasheetService;

@RestController
@RequestMapping("/")
public class DatasheetApi {

	@Autowired
	private DatasheetRepository datasheetRepository; 
	
	@Autowired
	private DatasheetService datasheetService;
	
	@GetMapping("datasheet/ecn/{engineeringCommodityName}/region/{region}")
	public List<Datasheet> getDatasheet(@PathVariable String engineeringCommodityName , @PathVariable String region)
	{
		System.out.println("In getDatasheet() Method");
		List<Datasheet> data = datasheetRepository.findByEngineeringCommodityNameAndRegion(engineeringCommodityName, region);
		return data;
		
	}
	
}
