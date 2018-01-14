package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.dashboard;


@Service
@Transactional
public class RestService {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<dashboard> save_data()
	{
		Session session = sessionFactory.getCurrentSession();
		dashboard d = new dashboard();
		d.setModelYear(2020);
		d.setPmt("PMT_1");
		d.setVehicleLine("C123");
		d.setRegion("C123_NA");
		d.setEngineeringCommodityName("bodySide_wheelArch_rockerMoldings");
		session.saveOrUpdate(d);
		List<dashboard> data= new ArrayList<>();
		data.add(d);
		return data;
	}
	
}
